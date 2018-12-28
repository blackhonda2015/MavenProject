package com.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


public class BaseClass {
	
	WebDriver driver;
	@Test
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
//		driver = new HtmlUnitDriver();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
