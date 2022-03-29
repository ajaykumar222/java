package inetBankingv1.inetBankingv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XelateSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qa.sevenchats.com:7444/sign_in");
		

	}

}
