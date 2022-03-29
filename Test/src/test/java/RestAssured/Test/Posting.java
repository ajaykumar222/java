package RestAssured.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Posting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

   WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[6]/a[1]/*[1]")));
		WebElement element= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[6]/a[1]/*[1]"));
		Actions builder = new Actions(driver);
	     builder.moveToElement( element ).click( element );
	     builder.perform();
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='category_poll']")));
		se.selectByVisibleText("World Issues");
		driver.findElement(By.xpath("//textarea[@id='post_title']")).sendKeys("How is the climate in Bangalore");
		driver.findElement(By.xpath("//input[@id='option1']")).sendKeys("is it raining");
		driver.findElement(By.xpath("//input[@id='option3']")).sendKeys("is it cold outside");
		driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();
	}

}
