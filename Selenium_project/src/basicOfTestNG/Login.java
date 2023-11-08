package basicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	
	public void login() {
		System.out.println("Login Test Case Succesfully");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("daman@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("@00Daman0000");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	

}
