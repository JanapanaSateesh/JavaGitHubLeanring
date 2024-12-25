package com.astec.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> eleList=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		for(int i=1;i<=5;i++) {
			String prodName=driver.findElement(By.xpath("((//div[@data-component-type='s-search-result'])["+i+"])//div[@data-cy='title-recipe']//span")).getText();
			System.out.println(prodName);
		}
	}

}
