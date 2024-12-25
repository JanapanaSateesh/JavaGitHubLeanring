package com.astec.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public Properties prop;
	
	public ReadConfig() throws IOException {
		File file=new File("./Configuration/config.properties");
		FileInputStream fi=new FileInputStream(file);
		prop=new Properties();
		prop.load(fi);
		
	}
	
	public String getUrl() {
		
		
		String url= prop.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username= prop.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password= prop.getProperty("password");
		return password;
	}
}
