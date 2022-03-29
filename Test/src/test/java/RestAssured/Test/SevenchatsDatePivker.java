package RestAssured.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.DateUtil;

public class SevenchatsDatePivker {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://qa.sevenchats.com:7444/sign_in");;
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/form/div[1]/input")).sendKeys("8310714356");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abcde@98765");
	driver.findElement(By.xpath("//button[@id='signInBtn']")).click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	for(int i=100;i<1000;i++) {
		driver.findElement(By.xpath("//textarea[@id='message']")).clear();
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Numbers from 100 to 1000 ="+i);
	
	driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
	
	}
    
	}
}
