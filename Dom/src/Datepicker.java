import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.sevenchats.com:7444/sign_up");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='date_of_birth']")));
		driver.findElement(By.xpath("//input[@id='date_of_birth']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[11]")));
		driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[11]")).click();
		
		
		
	}
	
		
		
		
	}
	
