package com.test.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSelTest extends TestBase {

	
	@Test(description ="1. My Simple site logo test", enabled =false, priority=1)
	public void MyTestNGtest1() {
	driver.get("http://www.simplesite.com");
	String expectedValue = "SimpleSite.com11";
	String actualValue = homepage.SimpleSiteLogo().getText();
	Assert.assertEquals(actualValue,expectedValue,"Error:Simple site logo not found" );
	}

	@Test(description ="2. My Simple site customer service title check", enabled =true, priority=2)
	public void MyTestNGtest2() {
	driver.get("http://www.simplesite.com");
    homepage.customerServicElement().click();
    String actualValue=driver.getTitle();
    String expectedValue="Customer Service | SimpleSite";
    Assert.assertEquals(actualValue, expectedValue,"Error: does not click on customer service");
}
}