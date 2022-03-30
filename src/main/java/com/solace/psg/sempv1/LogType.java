/**
 * 
 */
package com.solace.psg.sempv1;

/**
 * PunSub+ Service Log types.
 *  
 * @author Victor Tsonkov
 *
 */
public enum LogType
{
	DEBUG("debug"), 
	SYSTEM("system"), 
	REST("rest"), 
	EVENT("event"),
	COMMAND("command");
	
	private final String text;

	/**
	 * Initialises a new enum instance.
     * @param text
     */
	LogType(final String text) {
        this.text = text;
    }

	/**
	 * Returns this enum text value. 
	 */
	@Override
	public String toString()
	{
		return text;
	}
}
