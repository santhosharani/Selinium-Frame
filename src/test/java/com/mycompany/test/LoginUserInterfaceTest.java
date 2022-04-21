package com.mycompany.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.harman.base.WebDriverWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUserInterfaceTest extends WebDriverWrapper{
	
	@Test
	public void validateTitleTest() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, "OrangeHRM");
	}
	
	
	
}

