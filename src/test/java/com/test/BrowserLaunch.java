package com.test;

import org.testng.annotations.Test;

import com.test.base.TestBase;

public class BrowserLaunch extends TestBase {
	TestBase tb=new TestBase();
	@Test
	public void launchingBrowser()
	
	{
		tb.launchBrowser();
		System.out.println("test");
	}

}
