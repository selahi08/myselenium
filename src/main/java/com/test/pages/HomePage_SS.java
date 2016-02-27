package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_SS {
WebDriver driver;

public HomePage_SS(WebDriver driver){
this.driver = driver;

PageFactory.initElements(driver, this);
}

@FindBy(id="customerservice")
WebElement customerServicElement;

@FindBy(xpath=".//*[@id='logo']/a")
WebElement SimpleSiteLogo;


public WebElement customerServicElement(){
return 	customerServicElement;
}

public WebElement SimpleSiteLogo(){
return 	SimpleSiteLogo;
}
	
}
