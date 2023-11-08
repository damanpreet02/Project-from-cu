package basicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
	
@Test
	
	public void registeing() {
		System.out.println("Register test case succesfully");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[contains(@class,'register-button')]")).click();
		
		String gender = "male";
		
		if(gender.equals("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		else {
			driver.findElement(By.id("gender-female")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys("Damanpreet");
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		driver.findElement(By.id("Email")).sendKeys("daman@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("@00Daman0000");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("@00Daman0000");
		
		driver.findElement(By.id("register-button")).click();
//		driver.quit();
		
		
	}

}
