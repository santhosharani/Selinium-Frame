package com.mycompany.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.harman.base.WebDriverWrapper;
import com.harman.utilities.DataUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends WebDriverWrapper{
    
	@Test
	public void validCredentialTest() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}
	
	
	@Test(dataProviderClass=DataUtils.class,dataProvider="invalidCredentialData")
	public void invalidCredentialsTest(String username , String password , String expectedResult) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		String actualvalue = driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualvalue, expectedResult);
	    System.out.println(actualvalue);
	}
	
}
