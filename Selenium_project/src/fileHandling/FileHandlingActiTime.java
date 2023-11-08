package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingActiTime {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\Collage\\File Handling Proprties File\\ActiTime.properties");
		
		Properties prop = new Properties();
		
		prop.load(fs);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String un = prop.getProperty("un");
		System.out.println(un);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.xpath("")).sendKeys(un);;
		
		
		
	}

}
