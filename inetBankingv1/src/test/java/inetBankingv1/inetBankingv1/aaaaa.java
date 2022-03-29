package inetBankingv1.inetBankingv1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class aaaaa {
	@Test
	public void method() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(screenshot, new File("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\homePageScreenshot.png"));}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		String a=driver.getCurrentUrl();
		System.out.println(a);
		
	}

}
