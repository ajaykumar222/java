import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/java_strings.asp");

	}

}
