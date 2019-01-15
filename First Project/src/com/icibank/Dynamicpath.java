package com.icibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91879\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://eenadupellipandiri.net");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 //String actualvalue = driver.findElement(By.linkText("Register Now")).getText();
		 String actualvalue = driver.findElement(By.linkText("Register Now")).getAttribute("href");

		 String expectedvalue = "Register Now";
		 
		 System.out.println("Actualvalue = "  +actualvalue);
		 System.out.println("Expectedvalue =" +expectedvalue);
		 
		 if(actualvalue.equals(expectedvalue)){
			 System.out.println("Both values are equal through get texg method");
		 }
		 else{
			 System.out.println("Both values are equal through get texg method");
		 }

	}

}
