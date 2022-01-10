package sevenchats_V1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    
    @FindBy(name ="date_of_birth")
	
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
		
		if(Gender.equals("Male"))
		{
		
			Select se= new Select(gender);
			se.selectByValue("1");
			
		}
		else
		{
			
			Select se =new Select(gender);
			se.selectByValue("2");
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
    public  void setCalendar() throws InterruptedException 
    
    {
    	date.click();
    	Thread.sleep(3000);
    	 WebElement r = driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]"));
         driver.switchTo().frame(r);
        
    	date.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[4]")).click();

    	 
    }
    public void setMobile(String Mobileno)
    {
    	mobileNO.sendKeys(Mobileno);
    }
    public void setCountry()
    {
    	Select select = new Select(country);
    	
    	select.selectByValue("India");
    	
    }
    
    public void setState()
    {
    	Select select = new Select(state);
    	
    	select.selectByValue("Karnataka");
    }
    public void setCity()
    {
    	Select select = new Select(city);
    	
    	select.selectByValue("Bangalore");
    }
    public void setSelect()
    {
    	 rButton.click();
    }
    public void setSignup()
    {
    	signUp.click();
    }
   
	
	
	
	
	
	
	
	
	
	
	
}
