package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utility.TestUtil;

public class TestBase {
	//Author Sounder rajan
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\RC HARI\\eclipse-workspace\\FreeCrmTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}
	
	public static void initilization() {
		
	String BrowserName=prop.getProperty("browser");	
	if(BrowserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RC HARI\\Desktop\\selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(BrowserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RC HARI\\Desktop\\selenium\\gecko FF driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_time, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_time, TimeUnit.SECONDS);
	
	
	driver.get(prop.getProperty("url"));
	}
}
