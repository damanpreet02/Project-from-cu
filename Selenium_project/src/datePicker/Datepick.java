package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
//		String month = "may";
//		int date = 15;
//		int year = 2002;
		
		while(true) {
			
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			if(month.equals("May") && year.equals("2002")) {
				
				driver.findElement(By.xpath("//a[text()='15']")).click();
				break;
				
			}
			else {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
			
			
		}
		//driver.findElement(By.xpath("(//a[@class='ui-state-default'])[28]")).click();
		
		
	}

}
