package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down_Demo {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,500)", "");
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,-500)", "");
		
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,0)", "");
		Thread.sleep(2000);
		
		WebElement ab = driver.findElement(By.xpath("(//h2[@class='card-title pb-4'])"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].scrollIntoView(true)", ab);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File vis = ts.getScreenshotAs(OutputType.FILE);
		File vid = new File("C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Screenshot\\sc.png");
		FileUtils.copyFile(vis, vid);	
}
}
