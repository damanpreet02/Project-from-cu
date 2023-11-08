package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement button = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement button1 = driver.findElement(By.xpath("//li[text()='G']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(button).perform();
		Thread.sleep(2000);
		act.clickAndHold(button1).perform();
		
//		act.dragAndDrop(button, button1).perform();
	}

}
