package com.astec.selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SeleniumSelectCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(2000);
		List<WebElement> elelist= driver.findElements(By.xpath("//select[@id='oldSelectMenu']//option"));
		
//		Select select=new Select(driver.findElement(By.id("oldSelectMenu")));
//		select.selectByValue("10");
//		select.selectByVisibleText("Acqua");
//		Thread.sleep(2000);
		ArrayList<String> colorslist=new ArrayList<String>();
		
		
		for(WebElement element:elelist) {
			String options=element.getText();
			colorslist.add(options);
			//System.out.println(options);
		}
		ArrayList<String> colorlistwithoutSort= (ArrayList<String>) colorslist.clone();
		System.out.println(colorlistwithoutSort);
		
		Collections.sort(colorslist);
		
		System.out.println(colorslist);
		
		boolean isSort= colorlistwithoutSort.equals(colorslist);
		
		System.out.println(isSort);
		
		

	}

}
