package RestAssured.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Calender {
	@Test
	public void setCalendar() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.sevenchats.com:7443/sign_up");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='date_of_birth']")).click();
		Thread.sleep(5000);
		WebElement de=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/select"));
		de.click();
		Select se=new Select(de);
		se.selectByValue("0");
		driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[4]")).click();
		
	}

}
