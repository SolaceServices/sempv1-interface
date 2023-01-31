package com.solace.psg.sempv1;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.solace.psg.sempv1.solacesempreply.ClientType;
import com.solace.psg.sempv1.solacesempreply.MessageSpoolMessageVpnEntry;
import com.solace.psg.sempv1.solacesempreply.QendptInfoType;
import com.solace.psg.sempv1.solacesempreply.QueueType;

import com.solace.psg.sempv1.solacesempreply.RpcReply.MoreCookie;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Log.Rest.Entry;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.MessageSpool.MessageSpoolInfo;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.MessageVpn;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.MessageVpn.Vpn;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Queue.Queues;
import com.solace.psg.sempv1.solacesemprequest.Rpc.Show.Log;

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
 * 
 *
 */
public class ShowCommands
{
	private static final Logger logger = LoggerFactory.getLogger(ShowCommands.class);

	private SempSession session;
	
	private int pageElementCount = 50;
	
	private String showMessageVPNs = "<show><message-vpn><vpn-name>*</vpn-name></message-vpn></show></rpc>";	
	private String showMessageSpoolDetail = "<show><message-spool><vpn-name>{vpn}</vpn-name><detail></detail></message-spool></show></rpc>";	

	private String showSubcriptions = "<show><smrp><subscriptions></subscriptions></smrp></show></rpc>";

	private String showVpnQueues = "<show><queue><name>*</name><vpn-name>{vpn}</vpn-name><count/><num-elements>{elementCount}</num-elements></queue></show></rpc>";

	private String showVpnQueuesStats = "<show><queue><name>*</name><vpn-name>{vpn}</vpn-name><stats></stats></queue></show></rpc>";

	private String showVpnQueueDetail = "<show><queue><name>*</name><vpn-name>{vpn}</vpn-name><detail></detail></queue></show></rpc>";

	private String showQueueSpooledMessages = "<show><queue><name>{queueName}</name><vpn-name>{vpn}</vpn-name></queue></show></rpc>";

	//private String showLog = "<show><log><{logType}></{logType}></log></show></rpc>";
	private String showLogTail = "<show><log><{logType}><lines></lines><num-lines>{lineCount}</num-lines></{logType}></log></show></rpc>";
	//private String showRestLog = "<show><log><{logType}><rest-delivery-point></rest-delivery-point><errors></errors></{logType}></log></show></rpc>";
	private String showRestLogWide = "<show><log><{logType}><rest-delivery-point></rest-delivery-point><errors></errors><wide></wide></{logType}></log></show></rpc>";

	private String showClients = "<show><client><name>*</name></client></show></rpc>";

	private String showClientDetails = "<show><client><name>{clientName}</name><vpn-name>{vpn}</vpn-name><detail></detail></client></show></rpc>";

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

		logger.info("Show command completed", command);
	
		return result;
	}
	
	/**
	 * Gets the Message spool Details for a VPN.
	 * @param vpnName
	 * @return
	 * @throws IOException
	 * @throws JAXBException
	 * @throws HttpException
	 */
	public MessageSpoolMessageVpnEntry getMessageSpoolDetail(String vpnName) throws IOException, JAXBException, HttpException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		
		MessageSpoolMessageVpnEntry result = null;
		
		session.open();

		String command = showMessageSpoolDetail.replace("{vpn}", vpnName);
		
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

			List<Object> entries = reply.getRpc().getShow().getMessageSpool().getMessageVpn().getVpnNameOrVpnOrMessageSpoolRates();
			result = (MessageSpoolMessageVpnEntry)entries.get(0);

		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", command);
		
		return result;
	}	
	/**
	 * Gets the queue details.
	 * @param vpnName
	 * @param queueName
	 * @return
	 * @throws JAXBException 
	 * @throws IOException 
	 * @throws AuthenticationException 
	 */
	public QendptInfoType getQueueDetails(String vpnName, String queueName) throws JAXBException, AuthenticationException, IOException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		
		QendptInfoType result = null;
		
		session.open();

		String command = showVpnQueueDetail.replace("{vpn}", vpnName).replace("{queueName}", queueName);

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
			result = type.getInfo();
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", command);
	
		return result;
	}
	/**
	 * Gets queues info.
	 * @param vpnName
	 * @return
	 * @throws JAXBException
	 * @throws AuthenticationException
	 * @throws IOException
	 */
	public Queues getVpnQueueStats(String vpnName) throws JAXBException, HttpException, IOException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		
		Queues result = null;
		
		session.open();

		String command = showVpnQueuesStats.replace("{vpn}", vpnName);

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

			result = reply.getRpc().getShow().getQueue().getQueues();
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
			throw new HttpException("Request returned unexpected Status code: " + response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", command);
	
		return result;
	}

	/**
	 * Gets list of queues for a VPN.
	 * @param vpnName
	 * @return
	 * @throws IOException 
	 * @throws JAXBException 
	 * @throws HttpException 
	 */
	public List<String> getLogTail(LogType logType, int lineCount) throws IOException, JAXBException, HttpException
	{
		if (lineCount < 1)
			throw new IllegalArgumentException("Argument lineCount cannot be less than 1.");
		
		List<String> result = null;
		
		session.open();

		String command = null;
		if (logType == LogType.REST)
			command = showRestLogWide.replace("{logType}", logType.toString());
		else
			command = showLogTail.replace("{logType}", logType.toString()).replace("{lineCount}", String.valueOf(lineCount));
		
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

			com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Log log = reply.getRpc().getShow().getLog();
	
			switch (logType)
			{
				case COMMAND:
					result = log.getCommand().getLogEntry();
					break;
				case SYSTEM:
					result = log.getSystem().getLogEntry();
					break;				
				case EVENT:
					result = log.getEvent().getLogEntry();
					break;
				case DEBUG:
					result = log.getDebug().getLogEntry();
					break;
				case REST:
					// REST logs seem to come all back paginated, so no need to check the more cookie. 
					List<Entry> allEntries = log.getRest().getEntry();
					result = new ArrayList<String>();	
					
					// Trim the lineCount lines from the end.
					List<Entry> lastEntries = null;
					if (allEntries.size() > lineCount)
						lastEntries = allEntries.subList(allEntries.size() - lineCount, allEntries.size());
					else
						lastEntries = allEntries;

					// Parse result.
					for (Entry entry : lastEntries)
						result.add(getRestEntryToString(entry));
					//int size = allEntries.size() <= lineCount ? allEntries.size() : lineCount;
					//for (int i = 0; i < size; i++)
					//	result.add(getRestEntryToString(lastEntries.get(i)));
					break;
			}
			
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", command);
		
		return result;
	}

	/**
	 * Entry class doesn't have a toString implementation so we need to provide one. 
	 * @param entry
	 * @return
	 */
	private String getRestEntryToString(Entry entry)
	{
		String delimiter = " | ";
		StringBuilder sb = new StringBuilder();
		sb.append(entry.getTimestamp());sb.append(delimiter);
		sb.append(entry.getVpnName());sb.append(delimiter);
		sb.append(entry.getRdpName());sb.append(delimiter);
		sb.append(entry.getRestConsumerName());sb.append(delimiter);
		sb.append(entry.getLocalAddress());sb.append(delimiter);
		sb.append(entry.getRemoteAddress());sb.append(delimiter);
		sb.append(entry.getRestErrorResponses());
		
		return sb.toString();	
	}
	
	public List<String> getAllMessageVPNs() throws IOException, JAXBException, HttpException
	{
		ArrayList<String> result = new ArrayList<String>();
		
		session.open();

		String command = showMessageVPNs;
		
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

			List<Vpn> vpns = reply.getRpc().getShow().getMessageVpn().getVpn();		

			for (int subCounter = 0; subCounter < vpns.size(); subCounter++)
			{
				Vpn vpn = vpns.get(subCounter);
				result.add(vpn.getName());
			}

			MoreCookie mc = reply.getMoreCookie();
			while (mc != null)
			{
				String commandMore = getMoreCookieContent(apiOutput);
						
				session.reopen();
				response = session.executeMore(commandMore);

				if (response.getStatusLine().getStatusCode() != 200)
				{
					throw new HttpException("The request status code was: " + response.getStatusLine().getStatusCode());
				}
				
				else
				{
					logger.info("Received 200 response from SEMP API more command");

					httpEntity = response.getEntity();
					apiOutput = EntityUtils.toString(httpEntity);

					jaxbContext = session.getRpcReplyContext();
					jaxbUnmarshaller = jaxbContext.createUnmarshaller();

					reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
							.unmarshal(new StringReader(apiOutput));

					vpns = reply.getRpc().getShow().getMessageVpn().getVpn();		

					for (int subCounter = 0; subCounter < vpns.size(); subCounter++)
					{
						Vpn vpn = vpns.get(subCounter);
						result.add(vpn.getName());
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

		logger.info("Show command completed", command);
		
		return result;		
	}	
	
	/**
	 * Gets all client names on the broker. 
	 * @return list of client names currently connected.
	 * @throws IOException
	 * @throws JAXBException
	 * @throws HttpException
	 */
	public List<String> getAllClientNames() throws IOException, JAXBException, HttpException
	{
		ArrayList<String> result = new ArrayList<String>();
		
		session.open();

		String command = showClients;
		
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

			List<ClientType> clients = reply.getRpc().getShow().getClient().getPrimaryVirtualRouter().getClient();		

			for (int subCounter = 0; subCounter < clients.size(); subCounter++)
			{
				ClientType ct = clients.get(subCounter);
				result.add(ct.getName());
			}

			MoreCookie mc = reply.getMoreCookie();
			while (mc != null)
			{
				String commandMore = getMoreCookieContent(apiOutput);
						
				session.reopen();
				response = session.executeMore(commandMore);

				if (response.getStatusLine().getStatusCode() != 200)
				{
					throw new HttpException("The request status code was: " + response.getStatusLine().getStatusCode());
				}
				
				else
				{
					logger.info("Received 200 response from SEMP API more command");

					httpEntity = response.getEntity();
					apiOutput = EntityUtils.toString(httpEntity);

					jaxbContext = session.getRpcReplyContext();
					jaxbUnmarshaller = jaxbContext.createUnmarshaller();

					reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
							.unmarshal(new StringReader(apiOutput));

					clients = reply.getRpc().getShow().getClient().getPrimaryVirtualRouter().getClient();	
					for (int subCounter = 0; subCounter < clients.size(); subCounter++)
					{
						ClientType ct = clients.get(subCounter);
						result.add(ct.getName());
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

		logger.info("Show command completed", command);
		
		return result;		
	}	
	
	/**
	 * Show client details for a given client name. 
	 * @param clientName the client name
	 * @return
	 * @throws IOException
	 * @throws JAXBException
	 * @throws HttpException
	 */
	public List<ClientType> getClientDetails(String clientName) throws IOException, JAXBException, HttpException
	{
		if (clientName == null)
			throw new IllegalArgumentException("Argument clientName cannot be null.");

		return getClientDetails(clientName, "*");
	}
	
	/**
	 * Show client details for a given client name. 
	 * @param clientName the client name.
	 * @param vpnName the VPN name.
	 * @return
	 * @throws IOException
	 * @throws JAXBException
	 * @throws HttpException
	 */
	public List<ClientType> getClientDetails(String clientName, String vpnName) throws IOException, JAXBException, HttpException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		
		List<ClientType> result = new ArrayList<ClientType>();
		
		session.open();

		String command = showClientDetails.replace("{vpn}", vpnName).replace("{clientName}", clientName);
		
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

			List<ClientType> clients = reply.getRpc().getShow().getClient().getPrimaryVirtualRouter().getClient();
			
			result.addAll(clients);

			MoreCookie mc = reply.getMoreCookie();
			while (mc != null)
			{
				String commandMore = getMoreCookieContent(apiOutput);
						
				session.reopen();
				response = session.executeMore(commandMore);

				if (response.getStatusLine().getStatusCode() != 200)
				{
					throw new HttpException("The request status code was: " + response.getStatusLine().getStatusCode());
				}
				
				else
				{
					logger.info("Received 200 response from SEMP API more command");

					httpEntity = response.getEntity();
					apiOutput = EntityUtils.toString(httpEntity);

					jaxbContext = session.getRpcReplyContext();
					jaxbUnmarshaller = jaxbContext.createUnmarshaller();

					reply = (com.solace.psg.sempv1.solacesempreply.RpcReply) jaxbUnmarshaller
							.unmarshal(new StringReader(apiOutput));

					clients = reply.getRpc().getShow().getClient().getPrimaryVirtualRouter().getClient();	
					result.addAll(clients);
				}
				
				mc = reply.getMoreCookie();
			}
		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
		}

		session.close();

		logger.info("Show command completed", command);
		
		return result;		
	}
	
	/**
	 * Gets list of queues for a VPN.
	 * @param vpnName
	 * @return
	 * @throws IOException 
	 * @throws JAXBException 
	 * @throws HttpException 
	 */
	public List<String> getVpnQueues(String vpnName) throws IOException, JAXBException, HttpException
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

				if (response.getStatusLine().getStatusCode() != 200)
				{
					throw new HttpException("The request status code was: " + response.getStatusLine().getStatusCode());
				}
				
				else
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

		logger.info("Show command completed", command);
		
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
