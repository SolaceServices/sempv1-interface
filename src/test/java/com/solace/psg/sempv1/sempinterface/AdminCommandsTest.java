package com.solace.psg.sempv1.sempinterface;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.auth.AuthenticationException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.solace.psg.sempv1.AdminCommands;
import com.solace.psg.sempv1.HttpSempSession;

public class AdminCommandsTest extends BaseSempTest
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

		session = new HttpSempSession(username, password, sempUrl);	
	}

	@Test
	public void testPurgeQueueMessages()
	{
		try
		{
			String testQueueName = "testQueue1";
			AdminCommands admin = new AdminCommands(session);
		
			boolean result = admin.purgeQueueMessages(vpnName, testQueueName);
			assertTrue(result);

		}
		catch (AuthenticationException | IOException | JAXBException e)
		{
			fail("Error occured: " + e.getMessage());
		}

	}

}
