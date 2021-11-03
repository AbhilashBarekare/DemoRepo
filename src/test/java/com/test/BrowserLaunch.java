package com.test;

import org.testng.annotations.Test;

import com.test.base.TestBase;

public class BrowserLaunch {
	TestBase tb=new TestBase();
	@Test
	public void launchinBrowser()
	
	{
		tb.launchBrowser("chrome");
	}

}
