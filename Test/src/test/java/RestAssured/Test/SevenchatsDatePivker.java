package RestAssured.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.DateUtil;

public class SevenchatsDatePivker {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://qa.sevenchats.com:7444/sign_up");
	driver.findElement(By.xpath("//input[@id='date_of_birth']")).click();
	WebElement dateWidgetFrom = driver.findElement(By.xpath("//input[@id='date_of_birth']"));
	List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
	
    
	}
}
