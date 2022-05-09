package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Navigation_Demo {
	
	private static TakesScreenshot tc;

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Window Maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("vguru986@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("viswa@0510");
		Thread.sleep(2000);
		
		WebElement LogIn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		LogIn.click();
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File so = tc.getScreenshotAs(OutputType.FILE);
		File dec = new File ("C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Screenshot\\ss.png");
		//FileUtils.copyFile(so, dec);
		FileHandler.copy(so, dec);
		
	
		//WebElement clickbut=driver.findElement(By.xpath(")");
		//clickbut.click();
		
		//driver.close();
		
		
	}

}
