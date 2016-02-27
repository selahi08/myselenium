package com.test.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.test.pages.HomePage_SS;

public class TestBase {
protected WebDriver driver;
protected HomePage_SS homepage;
	@BeforeMethod
	public void BeforeMethod(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		homepage = new HomePage_SS(driver);
		}
	
	@AfterMethod
	public void AfterMethod(){
		driver.close();	
		}
	
	
	
}
