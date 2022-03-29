package Sevenchats.com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reradconfig {

	
	 Properties pro;
	 
	 public reradconfig()
		{
			File src= new File("C:\\Users\\Dell\\eclipse-workspace\\com.app\\src\\test\\java\\Sevenchats\\com\\app\\config.properties");
			try {
				FileInputStream fis =new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			}catch (Exception e) {
				System.out.println("Exception is "+ e.getMessage());
			}
	getMethod();
	 }
	 
@Test	
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\Jar files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String Url= getMethod();
	driver.get("Url");
}
	 

	
	 


public String getMethod(){
	 
	 String URL=pro.getProperty("baseurl");
	 return URL;}

}
	 
	 
