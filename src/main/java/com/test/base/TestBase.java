package com.test.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	WebDriver driver;
	
	
	
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		
			System.setProperty("driver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		}
	}

}
