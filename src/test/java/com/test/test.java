package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test {

	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("D:\\\\Selenium Workspace\\\\com.test\\\\src\\\\main\\\\java\\\\com\\\\test\\\\config\\\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url=prop.getProperty("url");
		System.out.println(url);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

	}

}
