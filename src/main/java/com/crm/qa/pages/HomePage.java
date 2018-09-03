package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//font[contains(text(),'User: Naveen K')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath="//td[contains(text(),'New Contact')]")
	WebElement NewContactsLabel;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		 
	}
	
	public boolean VerifyLoggedInUsername() {
		return UserNameLabel.isDisplayed();
	}
	
	public ContactsPage ClickOnContactsLink() {
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage ClickOnDealsLink() {
		DealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage ClickOnTasksLink() {
		TasksLink.click();
		return new TasksPage();
	}
	
	public void ClickOnNewContacts() {
		Actions action=new Actions(driver);
		action.moveToElement(ContactsLink).build().perform();
		NewContactsLabel.click();
	}
	
	
	
	

}
