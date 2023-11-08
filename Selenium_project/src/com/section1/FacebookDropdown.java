package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement create_account = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		create_account.click();
//		Select s = new Select(create_account);
//		s.selectByVisibleText("Create new account");
		
		Thread.sleep(2000);
		
		
		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		Select s1 = new Select(drop1);
		s1.selectByVisibleText("15");
		
		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(drop2);
		s2.selectByVisibleText("May");
		
		WebElement drop3 = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(drop3);
		s3.selectByVisibleText("2002");
		
	}

}
