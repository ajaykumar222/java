package Sevenchats.com.app;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNGException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing extends Automation {
	
	
	




public Testing(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	

	
		
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\jarfiles\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Automation a=new Automation(driver);
			
			a.method1();
			a.method2();
			a.method3();
			a.method4();
			a.method5();
		a.method6();
		a.method7();
		a.method8();
		
}
		
}		
		
	


