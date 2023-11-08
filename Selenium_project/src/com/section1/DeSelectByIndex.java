package com.section1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(3);
	}

}
