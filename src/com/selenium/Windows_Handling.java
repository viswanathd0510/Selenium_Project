package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhy\\Dropbox\\Applications\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		WebElement Login = driver.findElement(By.xpath("(//a['data-csa-c-content-id=nav_ya_signin'])[6]"));
		Login.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("vguru986@gmail.com");
		Thread.sleep(2000);
		
		WebElement cont = driver.findElement(By.xpath("(//span['id=continue'])[1]"));
		cont.click();
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Dviswanath@0510");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
		Thread.sleep(2000);
	
		Actions a = new Actions(driver);
	
		WebElement fresh = driver.findElement(By.xpath("//a[text()= 'Fresh']"));
		a.contextClick(fresh).build().perform();
		Thread.sleep(2000);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		WebElement coupon = driver.findElement(By.xpath("//a[text()= 'Coupons']"));
		a.contextClick(coupon).build().perform();
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		
		WebElement petsupplies = driver.findElement(By.xpath("//a[text()= 'Pet Supplies']"));
		a.contextClick(petsupplies).build().perform();
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		int size = driver.getWindowHandles().size();
		System.out.println("Total window count:"+size);
		System.out.println("******************************************");
		
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		System.out.println("******************************************");
		
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String cp : allwindow) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println("All Window Title:"+title);
		}
		
		Thread.sleep(2000);
		
		//Fresh
		String Title = "https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb";
		for (String ab : allwindow) {
			if (driver.switchTo().window(ab).equals(Title))
			{
				break;
			}
		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("lion dates");
		Thread.sleep(2000);
		
		WebElement enter = driver.findElement(By.id("nav-search-submit-button"));
		enter.click();
		Thread.sleep(2000);
		
		WebElement select = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]"));
		select.click();
		Thread.sleep(2000);
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File fb = tc.getScreenshotAs(OutputType.FILE);
		File cre = new File("C:\\Users\\vidhy\\eclipse-workspace\\Selenium_Project\\Screenshot\\liondates.png");
		FileUtils.copyFile(fb, cre);
		
		for (String cp : allwindow) {	
			if (!cp.equals(pw)) {
				driver.switchTo().window(cp);
				driver.close();
			}
		}
		}
}
}



