package RestAssured.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void setCalendar() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.sevenchats.com:7443/sign_up");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg= new File("C:/Users/Dell/OneDrive/Pictures/Screenshots/twoplugs.png");
		FileUtils.copyFile(src, trg);
	}

}
