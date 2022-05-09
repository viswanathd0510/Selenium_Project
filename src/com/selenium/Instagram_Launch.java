package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Launch {
	
	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(200, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		Point p = new Point(250, 200);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
		//URL Launch
		driver.get("https://www.instagram.com/");
		
		String title =driver.getTitle();
		System.out.println("Title:"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url:"+url);
		
		//Window Maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vguru986@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("viswa@0510");
		Thread.sleep(2000);
		
		WebElement LogIn = driver.findElement(By.xpath("//button[@type='submit']"));
		LogIn.click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
