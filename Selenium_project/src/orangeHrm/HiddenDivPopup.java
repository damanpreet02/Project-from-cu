package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement us = driver.findElement(By.xpath("//input[@id='username']"));
		us.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys("manager");
		
		
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();

		driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();

		String out = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(out);
		
		
	}

}
