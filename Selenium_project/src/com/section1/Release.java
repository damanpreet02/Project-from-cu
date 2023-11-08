package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Release {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement a = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement d = driver.findElement(By.xpath("//li[text()='D']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(a).perform();
		act.moveToElement(d).perform();
		Thread.sleep(2000);
		act.release().perform();
	}

}
