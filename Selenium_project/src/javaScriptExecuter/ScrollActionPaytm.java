package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActionPaytm {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		
//		JavascriptExecutor ex = (JavascriptExecutor) driver;
//		
//		ex.executeScript("window.scrollBy(0,1000)");
//		
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='_3vgAs _10_WU'])[2]")).click();
	}

}
