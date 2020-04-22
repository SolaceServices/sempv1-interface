package com.solace.psg.sempv1.sempinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solace.psg.sempv1.solacesempreply.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class CreateCommands
{

	private HttpSempSession session;

	private static final Logger logger = LoggerFactory.getLogger(CreateCommands.class);

	private JAXBContext jaxbContext;

	public CreateCommands(HttpSempSession session)
	{
		this.session = session;
	}

}
