package sevenchats_V1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\OneDrive\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://qa.sevenchats.com:7444/home");
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hi");
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//textarea[@id='message']\")).sendKeys(\"Hi\");")).click();
	}

}
