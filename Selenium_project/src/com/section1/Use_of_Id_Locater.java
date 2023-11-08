package com.section1;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_Id_Locater {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://punjab.chitkara.edu.in//Interface/index.php");
		
		WebElement searchbox = driver.findElement(By.id("username"));
		searchbox.sendKeys("2010990179");
		
		WebElement searchbox1 = driver.findElement(By.id("password"));
		searchbox1.sendKeys("DAMANPREET2002");
		
		WebElement searchbox2 = driver.findElement(By.id("instituteId"));
		searchbox2.sendKeys("CUIET");
		
		WebElement searchbox3 = driver.findElement(By.className("button_send"));
		searchbox3.click();
	}

}
