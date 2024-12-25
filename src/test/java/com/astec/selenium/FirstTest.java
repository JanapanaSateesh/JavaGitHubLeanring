package com.astec.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("")));
		Actions act=new Actions(driver);
//		act.doubleClick(driver.findElement(By.xpath(null))).build().perform();
//		act.contextClick(null);
//		act.dragAndDrop(null, null);
//		act.moveToElement(null).
		
		//driver.switchTo().alert().sen
		
	}

}
