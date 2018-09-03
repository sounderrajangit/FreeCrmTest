package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase {
	
	
	LoginPage login;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initilization();
		testutil=new TestUtil();
		contactspage =new ContactsPage();
		login =new LoginPage();
		homepage=login.Validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		testutil.SwitchToFrame();
		contactspage=homepage.ClickOnContactsLink();
		
		
	}
	
	@Test
	public void VerifyContactsPageContactLabelTest() {
		boolean tablename=contactspage.VerifyContactsPageContactLabel();
		Assert.assertTrue(tablename);
	}
	
	@Test
	public void ValidateCreateNewContact() {
		
		homepage.ClickOnNewContacts();
		contactspage.CreateNewContact("Mr.", "tom", "srs", "svs");
	}
	
	
	@AfterMethod
	public void tEARdoWN() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
