package com.org.dataReadUtility;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readProperties
{

	
	public static String readTestConfig(String key)
		{
			FileReader reader = null;
			try {
				reader = new FileReader("data/test.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		
			Properties prop = new Properties();	
	

				try {
					prop.load(reader);
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return prop.getProperty(key);	
		}
}
