package com.solace.psg.sempv1.sempinterface;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.auth.AuthenticationException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.solace.psg.sempv1.HttpSempSession;
import com.solace.psg.sempv1.ShowCommands;


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
		//sempUrl = System.getProperty("sempUrl");

		session = new HttpSempSession(username, password, sempUrl);	
	}

	@Test
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

	@Test
	public void testMessageSpoolCount()
	{
		try
		{
			ShowCommands show = new ShowCommands(session);
		
			List<String> queues = show.getVpnQueues(vpnName);
			assertNotNull(queues);
			assertTrue(queues.size() > 0);
		}
		catch (AuthenticationException | IOException | JAXBException | SAXException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}
}
