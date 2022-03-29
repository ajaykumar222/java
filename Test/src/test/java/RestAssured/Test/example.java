package RestAssured.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qa.sevenchats.com:7444/sign_in");;
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/form/div[1]/input")).sendKeys("8660803960");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Geetha#anroop45");
		driver.findElement(By.xpath("//button[@id='signInBtn']")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      JavascriptExecutor j = (JavascriptExecutor)driver;
		  if (j.executeScript("return document.readyState").toString().equals("complete")){
		         System.out.println("Page has loaded");}
		  driver.findElement(By.cssSelector("#root > div > div.Col_col__33moS.Col_col-sm-11__1_JZn.Col_col-md-11__2Vu1Z.Home_section2__InC6p > div > div > div.Row_flexRow__3-Gcq.ShoutForm_shoutForm__1mYkJ.Row_direction-column__iBMRQ > div > div:nth-child(4) > div > div:nth-child(6) > a > svg > path")).click();
		Select se = new Select(driver.findElement(By.xpath("//select[@id='category_poll']")));
		se.selectByVisibleText("World Issues");
		driver.findElement(By.xpath("//textarea[@id='post_title']")).sendKeys("How is the climate in Bangalore");
		driver.findElement(By.xpath("//input[@id='option1']")).sendKeys("is it raining");
		driver.findElement(By.xpath("//input[@id='option3']")).sendKeys("is it cold outside");
		driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();

	}

}
