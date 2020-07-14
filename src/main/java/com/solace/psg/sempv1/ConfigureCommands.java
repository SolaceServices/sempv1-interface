package com.solace.psg.sempv1;


import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;

import java.io.IOException;


public class ConfigureCommands extends SempCommand
{
	private String solaceSEMPConfigureSubscriptionEvents = "<message-vpn><vpn-name>{vpn}</vpn-name><event><publish-subscription><event-topic-format></event-topic-format><v2></v2></publish-subscription></event></message-vpn></rpc>";
	private String queueShutdownCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><shutdown><{shutdownType}></{shutdownType}></shutdown></queue></message-spool></rpc>";
	private String queueNoShutdownCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><no><shutdown><{shutdownType}></{shutdownType}></shutdown></no></queue></message-spool></rpc>";
	private String queueMaxUnackedCommand = "<message-spool><vpn-name>{vpn}</vpn-name><queue><name>{queueName}</name><max-delivered-unacked-msgs-per-flow><max>{maxUnacked}</max></max-delivered-unacked-msgs-per-flow></queue></message-spool></rpc>";
	
	public static final String FULL_TYPE = "full";
	public static final String INGRESS_TYPE = "ingress";
	public static final String EGRESS_TYPE = "egress";
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigureCommands.class);

	/**
	 * Initialises a new instance of the class.
	 * @param session SEMP HTTP session.
	 */
	public ConfigureCommands(SempSession session)
	{
		super(session);
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

		logger.info("Executing SEMP configure command shutdownQueue for vpn {}, queue {}.", vpnName, queueName);
		
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

		logger.info("Executing SEMP configure command enableQueue for vpn {}, queue {}.", vpnName, queueName);

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

		logger.info("Executing SEMP configure command setQueueMaxUnackedMessages for vpn {}, queue {}.", vpnName, queueName);

		return executeCommand(command);			
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

		logger.info("Executing SEMP configure command configureSubscriptionEvents for vpn {}.", vpnName);

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
