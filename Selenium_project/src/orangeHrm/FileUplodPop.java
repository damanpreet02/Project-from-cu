package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodPop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\HP\\Downloads\\SAP.docx");
		driver.findElement(By.id("file-submit")).click();
	}

}
