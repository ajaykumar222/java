package Sevenchats.com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;
	
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement a=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		Assert.assertTrue(a.isEnabled());{
			System.out.println("We can write ");
			
		}Assert.assertTrue(a.isDisplayed());{
			System.out.println("the search is visible ");
			
		}
		driver.close();
		
		
		
	}

}
