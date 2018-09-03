package com.crm.qa.smoke;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class Loginsuccess extends TestBase
{
  @Test
  public void f()
  {
	  LoginPage lg=new LoginPage();
	  lg.Validatelogin("123", "456");
	  
  }
}
