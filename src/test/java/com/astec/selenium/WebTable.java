package com.astec.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> eleList=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']"));
		for(int i=1;i<=eleList.size();i++) {
			String fname=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[1]")).getText();
			String salary=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[5]")).getText();
			if(fname.equals(null) && salary.equals(null)) {
				
			}else {
				int salAfterHike=Integer.valueOf(salary)+10000;
				System.out.println("First Name: "+fname+" "+"Salary: "+salAfterHike);
			}
			
		}
		
	}

}
