package com.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\Selenium Workspace\\com.test\\src\\main\\java\\com\\test\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void launchBrowser()
	{	
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		else
		{
			System.out.println("Invalid browser name");
		}
	}

}
