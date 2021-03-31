package com.pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Masterpage {
	public  static WebDriver driver;
	public Properties prop;
	public void masterpage() throws Exception {
	}
	
	public void initialsetup() throws Exception {
		FileInputStream ip=new FileInputStream("C:\\Users\\Venkat\\Documents\\Imdb\\src\\com\\files\\or.Properties");
		prop=new Properties();
		prop.load(ip);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkat\\Documents\\Imdb\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		
	}
	public void clickelement(String xpathkey) {
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).click();
		
	}
	public void senddata(String xpathkey,String userdata) {
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).sendKeys(userdata);
	
}
	public void selectdropdown(String sortby) {
		 driver.findElement(By.xpath(prop.getProperty(sortby))).click();
		 
		
		
		
	}
	public boolean iselementexists(String xpathkey) {
		try {
			driver.findElement(By.xpath(prop.getProperty(xpathkey)));
			return true;
		}
		catch(Exception e) {
			return false;
	
	}
	}
}
