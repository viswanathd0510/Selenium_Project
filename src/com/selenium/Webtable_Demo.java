package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Demo {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		System.out.println("***********Printing All Data***************");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
			
		}
		
            System.out.println("**************************************************");

                     System.out.println("************Printing Row Data**********************");
                   List<WebElement> rdata = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
                   for (WebElement rowdata : rdata) {
                	   System.out.println(rowdata.getText());
					
				}

                   System.out.println("**************************************************");
                   
                   
                   System.out.println("************Printing Particular Data**********************");
                WebElement pdata = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
              	   System.out.println(pdata.getText());
              	   
              	   driver.close();
}
}
