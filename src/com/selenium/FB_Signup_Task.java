package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup_Task {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.xpath("(//input[@name='firstname'])"));
		fname.sendKeys("Viswanath");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Dharmalingam");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("dviswanath00@gmail.com");
		Thread.sleep(2000);
		
		WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
		reemail.sendKeys("dviswanath00@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("dviswanath@00000");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Oct");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1985");
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File fb = tc.getScreenshotAs(OutputType.FILE);
		File cre = new File("C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Screenshot\\ff.png");
		FileUtils.copyFile(fb, cre);

		
	}

}
