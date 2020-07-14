package com.solace.psg.sempv1;

import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.solace.psg.sempv1.solacesempreply.QueueType;

import com.solace.psg.sempv1.solacesempreply.RpcReply.MoreCookie;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.JAXBException;

import javax.xml.bind.Unmarshaller;



import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Class to execute show commands.
 * 
 * @author VictorTsonkov
 *
 */
public class ShowCommands
{
	private SempSession session;
	
	private String showSubcriptions = "<show><smrp><subscriptions></subscriptions></smrp></show></rpc>";

	private String showVpnQueues = "<show><queue><name>*</name><vpn-name>{vpn}</vpn-name><count/><num-elements>{elementCount}</num-elements></queue></show></rpc>";

	private String showQueueSpooledMessages = "<show><queue><name>{queueName}</name><vpn-name>{vpn}</vpn-name></queue></show></rpc>";

	private static final Logger logger = LoggerFactory.getLogger(ShowCommands.class);
	
	private int pageElementCount = 50;

	/**
	 * Gets the page element count for elements retrieved on a single request.
	 * @return the pageElementCount
	 */
	public int getPageElementCount()
	{
		return pageElementCount;
	}

	/**
	 * Sets the page element count for elements retrieved on a single request.
	 * @param pageElementCount the pageElementCount to set
	 */
	public void setPageElementCount(int pageElementCount)
	{
		this.pageElementCount = pageElementCount;
	}

	private JAXBContext jaxbContext;

	/**
	 * Initialises a new instance of the class.
	 * @param session
	 * @throws SAXException 
	 */
	public ShowCommands(SempSession session) throws SAXException
	{
		this.session = session;
	}
	
	/**
	 * Gets the number of spooled messages for a queue.
	 * @param vpnName
	 * @param queueName
	 * @return
	 * @throws JAXBException 
	 * @throws IOException 
	 * @throws AuthenticationException 
	 */
	public BigInteger getSpooledMessageCount(String vpnName, String queueName) throws JAXBException, AuthenticationException, IOException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		
		BigInteger result = null;
		
		session.open();

		String command = showQueueSpooledMessages.replace("{vpn}", vpnName).replace("{queueName}", queueName);

		logger.info("Running show command: {}", command);
		CloseableHttpResponse response = session.execute(command);

		if (response.getStatusLine().getStatusCode() == 200)
		{
			logger.info("Received 200 response from SEMP API");

			HttpEntity httpEntity = response.getEntity();
			String apiOutput = EntityUtils.toString(httpEntity);

			jaxbContext = session.getRpcReplyContext();
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			com.solace.psg.sempv1.solacesempreply.RpcReply reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
					.unmarshal(new StringReader(apiOutput));

			QueueType type = reply.getRpc().getShow().getQueue().getQueues().getQueue().get(0);
			result = type.getInfo().getNumMessagesSpooled();
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", showSubcriptions);
	
		return result;
	}
	
	/**
	 * Gets list of queues for a VPN.
	 * @param vpnName
	 * @return
	 * @throws IOException 
	 * @throws AuthenticationException 
	 * @throws JAXBException 
	 */
	public List<String> getVpnQueues(String vpnName) throws AuthenticationException, IOException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		
		ArrayList<String> result = new ArrayList<String>();
		
		session.open();

		String command = showVpnQueues.replace("{vpn}", vpnName).replace("{elementCount}", String.valueOf(pageElementCount));
		
		logger.info("Running show command: {}", command);
		CloseableHttpResponse response = session.execute(command);

		if (response.getStatusLine().getStatusCode() == 200)
		{
			logger.info("Received 200 response from SEMP API");

			HttpEntity httpEntity = response.getEntity();
			String apiOutput = EntityUtils.toString(httpEntity);

			jaxbContext = session.getRpcReplyContext();
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			com.solace.psg.sempv1.solacesempreply.RpcReply reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
					.unmarshal(new StringReader(apiOutput));

			List<QueueType> queues = reply.getRpc().getShow().getQueue().getQueues().getQueue();

			for (int subCounter = 0; subCounter < queues.size(); subCounter++)
			{
				QueueType qt = queues.get(subCounter);
				result.add(qt.getName());
			}

			MoreCookie mc = reply.getMoreCookie();
			while (mc != null)
			{
				String commandMore = getMoreCookieContent(apiOutput);
						
				session.reopen();
				response = session.executeMore(commandMore);

				if (response.getStatusLine().getStatusCode() == 200)
				{
					logger.info("Received 200 response from SEMP API more command");

					httpEntity = response.getEntity();
					apiOutput = EntityUtils.toString(httpEntity);

					jaxbContext = session.getRpcReplyContext();
					jaxbUnmarshaller = jaxbContext.createUnmarshaller();

					reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
							.unmarshal(new StringReader(apiOutput));

					queues = reply.getRpc().getShow().getQueue().getQueues().getQueue();

					for (int subCounter = 0; subCounter < queues.size(); subCounter++)
					{
						QueueType qt = queues.get(subCounter);
						result.add(qt.getName());
					}
				}
				
				mc = reply.getMoreCookie();
			}
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", showSubcriptions);
		
		return result;
	}
	
	/**
	 * Gets the inner XML of the more cookie XML.  
	 * @param response
	 * @return
	 */
	private String getMoreCookieContent(String response)
	{
		//JAXBElement<MoreCookie> jaxbElement = new JAXBElement<MoreCookie>( new QName("", "more-cookie"), MoreCookie.class,  mc);
		//JAXBContext context = JAXBContext.newInstance(MoreCookie.class);
		//Marshaller m = context.createMarshaller();
		//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);			
		
		//StringWriter sw = new StringWriter();
		//m.marshal(jaxbElement, sw);
		//String commandMore = sw.toString();
		int indexOfCookie = response.indexOf("<more-cookie>");
		int lastIndexOfCookie = response.indexOf("</more-cookie>");
		return response.substring(indexOfCookie+14, lastIndexOfCookie);
	}
	
	/**
	 * Gets current subscriptions
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public HashMap<Integer, com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription> getCurrentSubscriptions()
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		ArrayList<com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription> subscriptions = new ArrayList<com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>();

		HashMap<Integer, com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription> subscriptionMap = new HashMap<Integer, com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>();

		session.open();

		logger.info("Running show command: {}", showSubcriptions);
		CloseableHttpResponse response = session.execute(showSubcriptions);

		if (response.getStatusLine().getStatusCode() == 200)
		{
			logger.info("Received 200 response from SEMP API");

			HttpEntity httpEntity = response.getEntity();
			String apiOutput = EntityUtils.toString(httpEntity);

			jaxbContext = session.getRpcReplyContext();

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			com.solace.psg.sempv1.solacesempreply.RpcReply reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
					.unmarshal(new StringReader(apiOutput));

			com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions subs = reply.getRpc().getShow()
					.getSmrp().getSubscriptions();

			subscriptions = (ArrayList<com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>) subs
					.getSubscription();

			for (int subCounter = 0; subCounter < subscriptions.size(); subCounter++)
			{
				com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription subscription = subscriptions
						.get(subCounter);
				int hashCode = Objects.hash(subscription.getVpnName(), subscription.getDestinationName(),
						subscription.getDestinationType(), subscription.getPersistence(), subscription.getRedundancy(),
						subscription.getBlockId(), subscription.getDtoPriority(), subscription.getTopic());
				subscriptionMap.put(hashCode, subscription);
			}
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", showSubcriptions);

		return subscriptionMap;
	}

}
