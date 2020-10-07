package com.solace.psg.sempv1.sempinterface;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpException;
import org.apache.http.auth.AuthenticationException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.solace.psg.sempv1.HttpSempSession;
import com.solace.psg.sempv1.ShowCommands;
import com.solace.psg.sempv1.solacesempreply.RpcReply.Rpc.Show.Queue.Queues;


public class ShowCommandsTest extends BaseSempTest
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
		username = System.getProperty("username");
		password = System.getProperty("password");
	    sempUrl = System.getProperty("url");
	    vpnName = System.getProperty("vpn");

		session = new HttpSempSession(username, password, sempUrl);	
	}

	@Test @Ignore
	public void testGetVpnQueues()
	{
		try
		{
			String queueName = "testQueue1";
			ShowCommands show = new ShowCommands(session);
		
			BigInteger count = show.getSpooledMessageCount(vpnName, queueName);
			assertNotNull(count);
		}
		catch (AuthenticationException | IOException | JAXBException | SAXException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}
	
	@Test //@Ignore
	public void testGetVpnQueuesStats()
	{
		try
		{
			ShowCommands show = new ShowCommands(session);
		
			Queues queues = show.getVpnQueueStats(vpnName);
			assertNotNull(queues);
		}
		catch (HttpException | IOException | JAXBException | SAXException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}

	@Test @Ignore
	public void testMessageSpoolCount()
	{
		try
		{
			ShowCommands show = new ShowCommands(session);
		
			List<String> queues = show.getVpnQueues(vpnName);
			assertNotNull(queues);
			assertTrue(queues.size() > 0);
		}
		catch (IOException | JAXBException | SAXException | HttpException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}
}
