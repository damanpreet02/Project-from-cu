package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\Collage\\File Handling Proprties File\\Facebook.properties");
		Properties prop = new Properties();
		
		prop.load(fs);
		
		String url = prop.getProperty("url");
		String fn = prop.getProperty("fn");
		String ln = prop.getProperty("ln");
		String pno = prop.getProperty("pno");
		String pss = prop.getProperty("pss");
		String date = prop.getProperty("date");
		String month = prop.getProperty("month");
		String year = prop.getProperty("year");
		String gender = prop.getProperty("gender");
		System.out.println(gender);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ln);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(pno);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pss);
		driver.findElement(By.id("day")).sendKeys(date);
		driver.findElement(By.id("month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(year);
//		String gen = driver.findElement(By.xpath("//span[contains(@id,'GU')]")).getText();
		
		
		if(gender.equals("female")) {
			
			driver.findElement(By.xpath("(//span[contains(@class,'dba')])[1]")).click();
			
		}
		else if(gender.equals("male")) {
			driver.findElement(By.xpath("(//span[contains(@class,'dba')])[2]")).click();
		}
		else {
			driver.findElement(By.xpath("(//span[contains(@class,'dba')])[3]")).click();
			
		}
		
		
		
		
	}

}
