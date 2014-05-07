package com.ra.framework;

import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

public class PropertyManager {
	
	static final Logger logger = Logger.getLogger(PropertyManager.class);
	
	private static Properties props = null;
	
	private PropertyManager() {
		
	}
	
	public static String getProperty (String key) {
		
		String value = System.getProperty(key);
		
		if (props == null) {
			props = new Properties();
			
			try {
				
				InputStream fis = ClassLoader.getSystemClassLoader().getResourceAsStream("RideAuction.properties");
				
				props.load(fis);
			}
			catch (FileNotFoundException fe) {
				fe.printStackTrace();
			}		
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (value == null) {
			value = props.getProperty(key);
		}
		
		logger.debug("Key: "+ key + " value: "+ value);
		
		return value;
	}

	public static void setProperty(String key, String value) {
		
		if (props == null) {
			
			props = new Properties();
			
			try {
				InputStream fis = ClassLoader.getSystemClassLoader().getResourceAsStream("RideAuction.properties");
				
				props.load(fis);
			}
			catch(FileNotFoundException fe) {
				fe.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		logger.debug("key: " + key + " value: "+ value);
	}
}
