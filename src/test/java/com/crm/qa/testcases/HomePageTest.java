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

public class HomePageTest extends TestBase{
	LoginPage login;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() {
		initilization();
		testutil=new TestUtil();
		login =new LoginPage();
		contactspage =new ContactsPage();
		homepage=login.Validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void VerifyHomePageTitleTest() {
		String title=homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "CRMPRO");
		
	}
	
	@Test(priority=2)
	public void VerifyLoggInUsernameTest() {
		testutil.SwitchToFrame();
		boolean user=homepage.VerifyLoggedInUsername();
		Assert.assertTrue(user);
	}
	
	@Test(priority=3)
	public void ClickOnContactsLinkTest() {
		contactspage=homepage.ClickOnContactsLink();
	}
	
	
	
	@AfterMethod 
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
