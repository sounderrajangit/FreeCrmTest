package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//here we have to create page factory or object repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;
	
	// here we are initializing the web elements
    // "this" keyword will initialize all object/web elements to the driver
	public LoginPage() {
		
		PageFactory.initElements(driver, this); 
	}
	
	// Actions
	public String LoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean CrmLogoImage() {
		
		return logo.isDisplayed();
	}
	
	public HomePage Validatelogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	


}
