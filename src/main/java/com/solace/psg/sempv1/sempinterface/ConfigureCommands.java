package com.solace.psg.sempv1.sempinterface;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;

public class ConfigureCommands
{
	private SempSession session;

	private String solaceSEMPConfigureSubscriptionEvents = "<message-vpn><vpn-name>{vpn}</vpn-name><event><publish-subscription><event-topic-format></event-topic-format><v2></v2></publish-subscription></event></message-vpn></rpc>";
	private String queueShutdownCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><shutdown><{shutdownType}></{shutdownType}></shutdown></queue></message-spool></rpc>";
	private String queueNoShutdownCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><no><shutdown><{shutdownType}></{shutdownType}></shutdown></no></queue></message-spool></rpc>";
	private String queueMaxUnackedCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><max-delivered-unacked-msgs-per-flow><max>{maxUnacked}</max></max-delivered-unacked-msgs-per-flow></queue></message-spool></rpc>";
	
	public static final String FULL_TYPE = "full";
	public static final String INGRESS_TYPE = "ingress";
	public static final String EGRESS_TYPE = "egress";
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigureCommands.class);

	private JAXBContext jaxbContext;

	/**
	 * Initialises a new instance of the class.
	 * @param session SEMP HTTP session.
	 */
	public ConfigureCommands(SempSession session)
	{
		this.session = session;
	}
	
	/**
	 * Shutdown a queue fully, egress or ingress.
	 * @vpnName the VPN
	 * @param queueName name of the queue
	 * @param shutdownType full, egress or ingress
	 * @return true if success
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public boolean shutdownQueue(String vpnName, String queueName, String shutdownType)
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		if (shutdownType == null)
			throw new IllegalArgumentException("Argument shutdownType cannot be null.");
		
		String command = queueShutdownCommand.replace("{vpn}", vpnName).replace("{queueName}", queueName).replace("{shutdownType}", shutdownType);

		return executeCommand(command);	
	}

	/**
	 * Enable a queue fully, egress or ingress.
	 * @param queueName name of the queue
	 * @param shutdownType full, egress or ingress
	 * @return true if success
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public boolean enableQueue(String vpnName, String queueName, String shutdownType)
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		if (shutdownType == null)
			throw new IllegalArgumentException("Argument shutdownType cannot be null.");
		
		String command = queueNoShutdownCommand.replace("{vpn}", vpnName).replace("{queueName}", queueName).replace("{shutdownType}", shutdownType);

		return executeCommand(command);	
	}
	
	/**
	 * Sets max unacked messages for on a queue. Default queue value is 10000. 
	 * @param vpnName
	 * @param queueName
	 * @param maxUnackedMessageCount
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public boolean setQueueMaxUnackedMessages(String vpnName, String queueName, int maxUnackedMessageCount) throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		if (maxUnackedMessageCount < 0)
			throw new IllegalArgumentException("Argument maxRedelivery cannot be less than 0.");
		
		String command = queueMaxUnackedCommand.replace("{vpn}", vpnName).replace("{queueName}", queueName).replace("{maxUnacked}", Integer.toString(maxUnackedMessageCount));

		return executeCommand(command);			
	}
	
	/**
	 * Executes a configuration command.
	 * @param command
	 * @return
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws AuthenticationException 
	 * @throws JAXBException 
	 */
	private boolean executeCommand(String command) throws ParseException, IOException, AuthenticationException, JAXBException
	{
		boolean success = false;

		session.open();		

		logger.info("Running configure command: {}", command);
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

			com.solace.psg.sempv1.solacesempreply.RpcReply.ExecuteResult result = reply.getExecuteResult();

			if (result.getCode().equals("ok"))
			{
				success = true;
			}
			else
			{
				success = false;
				logger.info("Response from SEMP API {}", apiOutput);
			}

			logger.info("Result code {}", result.getCode());

		}
		else
		{
			logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());

			success = false;
		}

		session.close();

		logger.info("Configure command completed ({})", command);

		return success;				
	}
	
	/**
	 * Configure subscription events for a VPN.
	 * @return true if success
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public boolean configureSubscriptionEvents(String vpnName)
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
	
		String command = solaceSEMPConfigureSubscriptionEvents.replace("{vpn}",
				vpnName);
		return executeCommand(command);	
	}

	/**
	 * Configure subscription events.
	 * @param messageVpn
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 
	public boolean configureSubscriptionEvents(String messageVpn)
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		session.setMessageVpn(messageVpn);

		return configureSubscriptionEvents();
	}*/
}
