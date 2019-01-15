package com.icibank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91879\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://eenadupellipandiri.net/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		// locators
		//driver.findElement(By.id("name")).sendKeys("ramesh");
		//driver.findElement(By.name("name")).clear();
		
		 List<WebElement> mar = driver.findElements(By.tagName("a"));
		 
		 for(int i = 0;i<mar.size();i++)
		 {
			if(!mar.get(i).getText().isEmpty())
				{ 
				String txt = mar.get(i).getText();
			    System.out.println(txt);
			 
				}
		 }
		
		
		
		
		
		
	}

}
