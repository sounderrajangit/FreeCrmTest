package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	
	@FindBy(name="title")
	WebElement DropDown;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="surname")
	WebElement LastName;
	
	@FindBy(name="client_lookup")
	WebElement CompanyName;
	
	@FindBy(xpath="//div[@id='existingCampaignLayer']/table[1]/tbody/tr[2]/td[1]/input[@value='Save' and @type='submit']")
	WebElement SaveButton;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean VerifyContactsPageContactLabel() {
		return ContactsLabel.isDisplayed();
	}
	
	public void CreateNewContact(String title,String fname,String lname,String cname) {
		
	Select select =new Select(DropDown);
	select.selectByVisibleText(title);
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	CompanyName.sendKeys(cname);
	SaveButton.click();
		
	}
	

	
	
	
	
	
}
