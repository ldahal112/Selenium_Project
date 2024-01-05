package com.dahal1.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Form {
	WebDriver driver;
	@BeforeMethod
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dahal1l.blogspot.com/2024/01/automation-form.html");
		
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void formAutomation() {
		driver.findElement(By.id("firstName")).sendKeys("sam");
		driver.findElement(By.id("lastName")).sendKeys("John");
		driver.findElement(By.id("phone")).sendKeys("12345");
		driver.findElement(By.id("country")).sendKeys("USA");
		driver.findElement(By.id("city")).sendKeys("Virginia");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='myDropdown']"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(6);
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.id("email2")).click();
		
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\ldaha\\OneDrive\\Desktop\\Imgs4blog\\sc1.png");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
	
	
	
	

}
