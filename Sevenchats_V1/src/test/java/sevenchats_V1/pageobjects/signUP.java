package sevenchats_V1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUP {
	WebDriver driver;
	
	public signUP(WebDriver adriver)
	{
		driver=adriver;
		PageFactory.initElements(adriver, this);
	}
    @FindBy(name ="first_name")
    WebElement fName;
    
    @FindBy(name ="last_name")
    WebElement lName;
    
    @FindBy(name ="email")
    WebElement eMail;
    
    
    @FindBy(name ="gender")
    WebElement gender;
    
    @FindBy(name ="password")
    WebElement password;
    
    @FindBy(name ="confirm_password")
    WebElement cPassword;
    
    @FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[1]/picture[1]/img[1]")
    WebElement date;
    
    @FindBy(name ="mobile")
    WebElement mobileNO;
    
    @FindBy(name ="country")
    WebElement country;
    
    @FindBy(name ="state")
    WebElement state;
    
    @FindBy(name ="city")
    WebElement city;
    
    @FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/p[1]/label[1]/span[1]")
    WebElement rButton;
    
    @FindBy(xpath ="//button[contains(text(),'Sign Up')]")
    WebElement signUp;
    
	public void setFirstName(String fname)
	{
		fName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		eMail.sendKeys(email);
	}
	public void setGender(String Gender)
	{
		gender.click();
		if(Gender.equals("Male"))
		{
		
			gender =driver.findElement(By.xpath("//option[contains(text(),'Male')]"));
		
			gender.click();
			
		}
		else
		{
			
			gender =(driver.findElement(By.xpath("//option[contains(text(),'Female')]")));
			
			gender.click();
		}
	}
    public void setPassword(String Password)
    {
    	password.sendKeys(Password);
    }
    public void setConfirmPassword(String cpassword)
    {
    	cPassword.sendKeys(cpassword);
    }
    public void setCalendar() throws InterruptedException
    
    {
    	date.click();
    	 Thread.sleep(3000);
    	 date = driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[4]"));
    	 date.click();
    	 
    }
    public void setMobile(String Mobileno)
    {
    	mobileNO.sendKeys(Mobileno);
    }
    
   
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
}