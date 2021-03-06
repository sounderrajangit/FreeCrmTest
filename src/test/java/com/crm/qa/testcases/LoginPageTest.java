package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage homepage;
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		 login=new LoginPage();
	} 
	
	@Test(priority=1)
	public void ValidateTitle() {
		String title=login.LoginPageTitle();
		
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void CrmImgLogoTest() {
		boolean img=login.CrmLogoImage();
		Assert.assertTrue(img);
	}
	
	@Test(priority=3)
	public void LoginTest() {
		homepage= login.Validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		 

	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	

}
