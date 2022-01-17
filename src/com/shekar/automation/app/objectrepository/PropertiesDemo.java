package com.shekar.automation.app.objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		//File file = new File("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\app\\objectrepository\\or.properties");
		//FileInputStream fip1 = new FileInputStream(file);
		
		FileInputStream fip = new FileInputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\app\\objectrepository\\or.properties");
		Properties properties = new Properties();
		properties.load(fip);
		
		properties.setProperty("java", "practice");
		properties.setProperty("job", "hardwork");
		properties.setProperty("name", "shekar");
		
		FileOutputStream fop = new FileOutputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\app\\objectrepository\\or.properties");
		properties.store(fop, "File is saved successfully");
	/*	String unIdValue = properties.getProperty("un_id");
		System.out.println(unIdValue);
		String unXpathValue = properties.getProperty("un_xpath");
		System.out.println(unXpathValue);
		String nextIdValue = properties.getProperty("next_id");
		System.out.println(nextIdValue);
		String nextXpathValue = properties.getProperty("next_xpath");
		System.out.println(nextXpathValue);
		String pwdNameValue = properties.getProperty("pwd_name");
		System.out.println(pwdNameValue);
		
		Object obj1 = properties.get("un_id");
		System.out.println(obj1);

		Object obj2 = properties.getOrDefault("un_id", "Java Programming");
		System.out.println(obj2);*/
		
		
	}

}
