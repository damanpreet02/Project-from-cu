package com.section1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLanguage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement lang = driver.findElement(By.className("icp-nav-link-inner"	));
		
		Actions act = new Actions(driver);
		act.moveToElement(lang).perform();
		Thread.sleep(2000);
		
		WebElement lang2 = driver.findElement(By.xpath("(//span[text()='हिन्दी'])[1]"));
		act.moveToElement(lang2).click().perform();
	}

}
