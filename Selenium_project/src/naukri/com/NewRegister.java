package naukri.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRegister {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("Damanpreet Singh");
		driver.findElement(By.id("email")).sendKeys("Damanpreets246@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@Daman2002");
		driver.findElement(By.id("mobile")).sendKeys("9814109937");
		driver.findElement(By.xpath("//h2[contains(text(),'m a fres')]")).click();
		
		Thread.sleep(2000);
		
		WebElement city =driver.findElement(By.id("currentCity"));
		city.sendKeys("Chandigarh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@value='a4']")).click();
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		//Select
		StringSelection path = new StringSelection("C:\\Users\\HP\\Downloads\\Damanpreet Singh 8.pdf");
		
		//Copy
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
		cp.setContents(path, null);
		
		
		Robot r = new Robot();
		//Paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
		
		
	}

}
