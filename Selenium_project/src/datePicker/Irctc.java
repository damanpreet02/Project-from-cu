package datePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("CHANDIGARH");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@role='option'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("AMRITSAR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
	
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		
		while(true) {
			String month = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]")).getText();
			String year = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]")).getText();
			
			if(month.equals("December") && year.equals("2023")) {
				driver.findElement(By.xpath("//a[text()='27']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon')]")).click();
			}
			
			
		}
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//strong[text()='Sleeper (SL)'])[1]")).click();
		driver.findElement(By.xpath("(//strong[text()='Wed, 27 Dec'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()=' Book Now '])[1]")).click();
		
		
	}

}
