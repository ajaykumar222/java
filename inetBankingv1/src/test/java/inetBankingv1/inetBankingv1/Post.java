package inetBankingv1.inetBankingv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Post {

	public static void main(String[] args) {
		
		
		driver.manage().window().maximize();
		driver.get("https://qa.sevenchats.com:7444/home");
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hi");
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//textarea[@id='message']\")).sendKeys(\"Hi\");")).click();
	}

}
