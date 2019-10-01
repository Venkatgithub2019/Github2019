package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 

{
	
	public static void main(String[] args) 
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Drivers\\Drivers2\\chromedriver.exe");
		ChromeDriver driver =new  ChromeDriver();
		driver.get("https://www.google.co.in");
		
		
		/*
		 * WebDriver driver;
		 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
		 * "\\Drivers\\chromedriver.exe"); driver=new ChromeDriver();
		 * 
		 * driver.get("https://www.google.co.in");
		 */
		 
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Admin\\Desktop\\Drivers\\Drivers2\\geckodriver.exe"); driver=new
		 * FirefoxDriver(); driver.get("https://www.google.co.in");
		 */
		
		
	}

}
