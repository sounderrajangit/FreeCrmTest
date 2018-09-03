package com.crm.qa.utility;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long page_load_time=20;
	public static long implicit_time=10;
	
	
	
	public void SwitchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
