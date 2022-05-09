package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement ab = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		ab.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		
		WebElement cb = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		cb.click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(5000);
		
		WebElement pb = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		pb.click();
		Alert a2 = driver.switchTo().alert();
		a2.sendKeys("Viswanath");
		Thread.sleep(5000);
		a2.accept();
		
		WebElement lb = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		lb.click();
		Alert a3=driver.switchTo().alert();
		a3.accept();
		Thread.sleep(5000);
		
		WebElement sa = driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		sa.click();
		Alert a4=driver.switchTo().alert();
		a4.accept();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File vis = ts.getScreenshotAs(OutputType.FILE);
		File vid = new File("C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Screenshot\\ad.png");
		FileUtils.copyFile(vis, vid);	
}

}
