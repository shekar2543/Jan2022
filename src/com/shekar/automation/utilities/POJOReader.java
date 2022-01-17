package com.shekar.automation.utilities;

import java.io.IOException;

import com.shekar.automation.supporters.PropertiesReader;

public class POJOReader {
	
	public static PropertiesReader getPRConfObj() throws IOException
	{
		PropertiesReader prConf = new PropertiesReader(FilePaths.confFilePath);
		return prConf;
	}
	
	public static PropertiesReader getPRorConfObj() throws IOException
	{
		PropertiesReader prOr = new PropertiesReader(FilePaths.orFilePath);
		return prOr;
	}


}
