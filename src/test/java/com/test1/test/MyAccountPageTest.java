package com.test1.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyAccountPageTest {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhasash\\Desktop\\eclipse\\jars\\chromedriver.exe");
		//Create driver to drive the browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.indeed.com");
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
		driver.findElement(By.id("fj")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		Assert.assertEquals("Selenium Jobs, Employment in London, OH | Indeed.com", driver.getTitle());
		driver.close();
	  
  }
}
