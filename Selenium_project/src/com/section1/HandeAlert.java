package com.section1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeAlert {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		 Thread.sleep(2000);
		 
		 WebElement a1 = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));
		 a1.click();
		 
		 Thread.sleep(2000);
		 
		 Alert alt = driver.switchTo().alert();
		 
		 alt.accept();
		 
		 Thread.sleep(2000);
		 
		 WebElement a2 = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
		 a2.click();
		 
		 Thread.sleep(2000);
		 
		 alt.accept();
		 
		 Thread.sleep(2000);
		 
		 a2.click();
		 alt.dismiss();
		 
		 Thread.sleep(2000);
		 
		 WebElement a3 = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
		 a3.click();
		 
		 alt.sendKeys("DAMAN");
		 
		 Thread.sleep(4000);
		 
		 alt.accept();
		 
		 Thread.sleep(2000);
	}

}
