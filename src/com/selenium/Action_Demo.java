package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ab = driver.findElement(By.xpath("(//a[@class='gb_A'])"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		//a.dragAndDrop(from, to).build().perform();
		//a.clickAndHold(from).moveToElement(to).release(to).build().perform();
	      a.click(ab).build().perform();
		
		
	
}

}
