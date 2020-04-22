/**
 * 
 */
package com.solace.psg.sempv1.sempinterface;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.auth.AuthenticationException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test class for ConfigureCommands.
 * @author VictorTsonkov
 *
 */
public class ConfigureCommandsTest extends BaseSempTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		username = System.getProperty("username");
		password = System.getProperty("password");

		session = new HttpSempSession(username, password, sempUrl);	
	}

	/**
	 * Test method for {@link com.solace.psg.sempv1.sempinterface.ConfigureCommands#shutdownQueue(java.lang.String, java.lang.String)}.
	 */
	@Test @Ignore
	public void testShutdownQueue()
	{
		try
		{
			String testQueueName = "testQueue1";
			ConfigureCommands config = new ConfigureCommands(session);
		
			boolean result = config.shutdownQueue(vpnName, testQueueName, ConfigureCommands.INGRESS_TYPE);
			assertTrue(result);

			result = config.shutdownQueue(vpnName, testQueueName, ConfigureCommands.EGRESS_TYPE);
			assertTrue(result);

			result = config.shutdownQueue(vpnName, testQueueName, ConfigureCommands.FULL_TYPE);
			assertTrue(result);
}
		catch (AuthenticationException | IOException | JAXBException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link com.solace.psg.sempv1.sempinterface.ConfigureCommands#enableQueue(java.lang.String, java.lang.String)}.
	 */
	@Test @Ignore
	public void testEnableQueue()
	{
		try
		{
			String testQueueName = "testQueue1";
			ConfigureCommands config = new ConfigureCommands(session);
		
			boolean result = config.enableQueue(vpnName, testQueueName, ConfigureCommands.INGRESS_TYPE);
			assertTrue(result);

			result = config.enableQueue(vpnName, testQueueName, ConfigureCommands.EGRESS_TYPE);
			assertTrue(result);

			result = config.enableQueue(vpnName, testQueueName, ConfigureCommands.FULL_TYPE);
			assertTrue(result);
		}
		catch (AuthenticationException | IOException | JAXBException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link com.solace.psg.sempv1.sempinterface.ConfigureCommands#configureSubscriptionEvents()}.
	 */
	@Test @Ignore
	public void testConfigureSubscriptionEvents()
	{
		try
		{
			ConfigureCommands config = new ConfigureCommands(session);
		
			boolean result = config.configureSubscriptionEvents(vpnName);
			assertTrue(result);
		}
		catch (AuthenticationException | IOException | JAXBException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}

	@Test 
	public void testConfigureMaxUnackedMessages()
	{
		try
		{
			String queueName = "testQueue1";
			ConfigureCommands config = new ConfigureCommands(session);
		
			boolean result = config.setQueueMaxUnackedMessages(vpnName, queueName, 10);
			assertTrue(result);
		}
		catch (AuthenticationException | IOException | JAXBException e)
		{
			fail("Error occured: " + e.getMessage());
		}
	}
}
