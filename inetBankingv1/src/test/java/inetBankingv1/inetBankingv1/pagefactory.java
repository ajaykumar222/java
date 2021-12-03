package inetBankingv1.inetBankingv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterClass;

public class pagefactory {
	
	WebDriver driver;
	
	public pagefactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="uid") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME,using ="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement login;
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	public void method()
	{
		username.sendKeys("mngr369570");
		password.sendKeys("Unytamu");
		login.click();
		
	}
	
	

}
