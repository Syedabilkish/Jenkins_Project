package com.ibm.jenkins.com.ibm.jenkins;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Launch_ApplicationTest {
	public WebDriver driver;
  @Test
  public void LoginTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\SELENIUM\\Selenium Setup\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://elearning.hommelle.com/");
	  String actual = driver.getTitle();
	  
	  String expected = "eLearning - eLearning";
	  Assert.assertEquals(expected,actual);
	  
	  driver.quit();
  }

}
