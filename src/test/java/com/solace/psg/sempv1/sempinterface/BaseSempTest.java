/**
 * 
 */
package com.solace.psg.sempv1.sempinterface;

import com.solace.psg.sempv1.HttpSempSession;

/**
 * BaseSempTest class.
 * @author VictorTsonkov
 *
 */
public abstract class BaseSempTest
{
	protected String sempUrl = "http://london.solace.com:8050/SEMP";
	
	protected String vpnName = "SAPAribaOld1";
	
	protected String username;
	
	protected String password;
	
	protected HttpSempSession session;
	
	public BaseSempTest()
	{
		
	}

}
