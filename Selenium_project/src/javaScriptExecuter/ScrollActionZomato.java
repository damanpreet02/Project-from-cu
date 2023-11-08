package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActionZomato {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		WebElement united = driver.findElement(By.xpath("//h5[text()='United Kingdom']"));
		
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		
		
		//1st method
//		ex.executeScript("window.scrollBy(0,4000)");
		
		//2nd Method
		ex.executeScript("arguments[0].scrollIntoView(false)", united);
		
		//if you pass true in scrollIntoView then element will shown at top of web page and if you pass false then element will shown at bottom of web page
		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//h5[text()='Malaysia']")).click();
		
		
		
	}

}
