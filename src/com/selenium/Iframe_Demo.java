package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Demo {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.id("Click"));
		a.click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement a1 = driver.findElement(By.id("Click1"));
		a1.click();
		Thread.sleep(2000);
		
		String text1 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text1);
}
}
