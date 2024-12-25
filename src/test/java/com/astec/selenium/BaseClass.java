package com.astec.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
	
	public static void main(String args[]) throws IOException {
		BaseClass baseclass=new BaseClass();
		baseclass.SetUp();
		
	}
	
	
	public void SetUp() throws IOException {
		
		
		ReadConfig credentialsdata=new ReadConfig();
		String url=credentialsdata.getUrl();
		String username=credentialsdata.getUsername();
		String password=credentialsdata.getPassword();
		
		driver=new ChromeDriver();
		//driver.get(url);
		driver.navigate().to(url);
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
	public void TearDown() {
		
	}
}
