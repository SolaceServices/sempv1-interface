/**
 * 
 */
package com.solace.psg.sempv1;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to handle all admin commands via SEMP V1.
 * 
 *
 */
public class AdminCommands extends SempCommand
{

	private String queueDeleteMessagesCommand = "<admin><message-spool><vpn-name>{vpn}</vpn-name><delete-messages><queue-name>{queueName}</queue-name></delete-messages></message-spool></admin></rpc>";

	private static final Logger logger = LoggerFactory.getLogger(AdminCommands.class);

	/**
	 * Initialises a new instance of the class.
	 * @param session SEMP HTTP session.
	 */
	public AdminCommands(SempSession session)
	{
		super(session);
	}
	
	/**
	 * Purges all messages from a queues for a provided VPN.
	 * @vpnName the VPN
	 * @param queueName name of the queue
	 * @return true if success
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws JAXBException
	 */
	public boolean purgeQueueMessages(String vpnName, String queueName)
			throws ClientProtocolException, IOException, AuthenticationException, JAXBException
	{
		if (vpnName == null)
			throw new IllegalArgumentException("Argument vpnName cannot be null.");
		if (queueName == null)
			throw new IllegalArgumentException("Argument queueName cannot be null.");
		
		String command = queueDeleteMessagesCommand.replace("{vpn}", vpnName).replace("{queueName}", queueName);

		logger.info("Executing SEMP configure command purgeQueueMessages for vpn {}, queue {}.", vpnName, queueName);

		return executeCommand(command);	
	}
}
