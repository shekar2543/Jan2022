package com.shekar.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
	
	private String filePath;
	private FileInputStream fileInputStream;
	private Properties properties;
	private String value;
	
	
	public PropertiesReader(String filePath) throws IOException 
	{
		this.filePath = filePath;
		//FileInputStream fileInputStream = new FileInputStream("config.properties");
		
		fileInputStream = new FileInputStream("com/shekar/automation/app/objectrepository/or.properties");
		
		
	    properties = new Properties();
		properties.load(fileInputStream);
		
	}
	
	public String getPropertyValue(String key) 
	{
		if(properties!=null)
		{
			value = properties.getProperty(key);
			
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
		return value;

	}
	public String getPropertyValue(String key, String defaultValue) 
	{
		if(properties!=null)
		{
			value = properties.getProperty(key, defaultValue);
			if(value==null)
			{
				value=defaultValue;
			}
			
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
		return value;

	}
	public String getPropertyValue(Object key) 
	{
		if(properties!=null)
		{
			value = (String) properties.get(key);
			
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
		return value;

	}
	public String getPropertyValue(Object key, Object defaultValue) 
	{
		if(properties!=null)
		{
			value = (String) properties.getOrDefault(key, defaultValue);
			if(value==null)
			{
				value=(String) defaultValue;
			}
			
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
		
		return value;

	} 
	
	public void writeKeyValue(String key, String value) throws FileNotFoundException, IOException
	{
			if(value==null)
			{
				properties.setProperty(key, value);
				properties.store(new FileOutputStream(filePath), "FILE IS SAVED");
			}
			else
			{
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
				//Throw exception
			}

	}
	public void writeKeyValue(Object key, Object value) throws FileNotFoundException, IOException
	{
			if(value==null)
			{
				properties.put(key, value);
				properties.store(new FileOutputStream(filePath), "FILE IS SAVED");
			}
			else
			{
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
				//Throw exception
			}		
	}
    public void removeKeyValue(Object key, Object value) throws FileNotFoundException, IOException
    {
    	if(value==null)
		{
			properties.remove(key, value);
			properties.store(new FileOutputStream(filePath), "REMOVED & FILE IS SAVED");
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}

    }
    public void removeKey(String key) throws FileNotFoundException, IOException
    {
    	if(value==null)
		{
			properties.remove(key);
			properties.store(new FileOutputStream(filePath), "REMOVED & FILE IS SAVED");
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
}
     public Map<String, String> getTotalData() 
     {
	   Map<String, String> mapData = new HashMap<String, String>();
	   
	   if(value==null)
		{
			Set setKeys = properties.keySet();
			for( Object	obj:setKeys)
			{
				String key = (String) obj;
				String value = properties.getProperty(key);
				mapData.put(key, value);
			}
		}
		else
		{
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
			//Throw exception
		}
	return mapData;		

     }
}