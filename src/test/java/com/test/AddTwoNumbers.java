package com.test;

import org.testng.annotations.Test;

public class AddTwoNumbers {

	@Test(invocationCount=4,priority=1)
	public void sum()
	{
		int a=10;
		int b=10;
		System.out.println("Sum of two no's is "+ (a+b));
		
	}
	@Test(priority=2)
	public void sub()
	{
		int a=20;
		int b=10;
		System.out.println(a-b);
	}
	

}
