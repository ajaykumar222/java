package inetBankingv1.inetBankingv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;
	@Test
	
	public void method() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/index.php");
	
	pagefactory first =PageFactory.initElements(driver, pagefactory.class);
	first.method();
	
	first.close();
	
	}
	

}