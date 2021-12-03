package sevenchats_V1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver edriver;
	
	public LoginPage(WebDriver rdriver)
	{
		edriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="email")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//div[contains(text(),'Forgot password ?')]")
	WebElement forgotPassword;
	
	@FindBy(xpath="//span[contains(text(),'Sign Up')]")
	WebElement signUP;
	
	@FindBy(xpath="//a[contains(text(),'About Us')]")
	WebElement aboutUS;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	WebElement privacyPolicy;
	

	@FindBy(xpath="//a[contains(text(),'User Agreement')]")
	WebElement userAgreement;
	
	
	
	
	
	
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	
	
	

}
