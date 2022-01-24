import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.sevenchats.com:7444/sign_up");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		
		WebElement date =driver.findElement(By.xpath("//input[@id='date_of_birth']"));
		date.click();
		
		String dateval="30-12-2000";
		selectDate(driver,date,dateval);
		

	}

	
	public static void selectDate(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
	}
}
