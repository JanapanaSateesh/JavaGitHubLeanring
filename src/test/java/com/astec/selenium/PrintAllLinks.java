package com.astec.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>  linkslist=driver.findElements(By.tagName("a"));
		for(WebElement ele:linkslist) {
			String link=ele.getAttribute("href");
			//System.out.println(link);
			
			if(link==null) {
				
			}else {
				URL hrefurl=new URL(link);
				HttpURLConnection con=(HttpURLConnection)hrefurl.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				
				if(con.getResponseCode()==200) {
					
				}else {
					System.out.println("Broken Link:"+link);
				}
				
			}
		}
		
	}

}
