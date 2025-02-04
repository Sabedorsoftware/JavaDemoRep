package com.login.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
  
	WebDriver driver =null;
	
  @BeforeMethod 
  public void Launch_Browser()
  {
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
	
  @Test
  public void Check_Login()
  {
	  String atcual="Hi";
	  String exp ="Hi";
	  assertEquals(atcual, exp);
  }
  
  
  @AfterMethod
  public void Close_Browser()
  {
	  driver.quit();
  }
}
