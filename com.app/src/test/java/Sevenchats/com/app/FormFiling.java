package Sevenchats.com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFiling {
	
	public static void main(String[] args) {
		
	
	WebDriver driver;
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\jarfiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement upload_file = driver.findElement(By.id("uploadPicture"));
	upload_file.sendKeys("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\homePageScreenshot.png");
	System.out.println("File is Uploaded Successfully");
	
	
	
	
	
	
	
	}
}
