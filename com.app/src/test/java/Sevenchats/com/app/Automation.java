package Sevenchats.com.app;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Automation {
	
	public static  WebDriver driver;
	public Automation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	
	
	
	
	
	@FindBy(name="firstname")
	WebElement Fname;
	
	@FindBy(name="lastname")
	WebElement Lname;
	
	@FindBy(name="sex")
	WebElement Gender;
	
	@FindBy(id="exp-1")
	WebElement Exp;
	
	@FindBy(id="datepicker")
	WebElement Date;
	
	@FindBy(id="profession-1")
	WebElement Profession;
	
	@FindBy(id="continents")
	WebElement Continents;
	
	@FindBy(xpath="//option[contains(text(),'Navigation Commands')]")
	WebElement SeleniumCommands;
	
	
	
	public void method1() {
		Fname.sendKeys("Ajay");
		
	}
	
	public void method2() {
		Lname.sendKeys("Kumar");
	}
	
	
	public void method3() {
		Gender.click();
	}
	
	
	public void method4() {
		Exp.click();
	}
	
	
	public void method5() {
		Date.sendKeys("22-10-1996");
	}
	
	public void method6() {
		Profession.click();
	}
	
	public void method7() {
		Select a=new Select(Continents);
		a.selectByVisibleText("Antartica");
		}
	
	
	public void method8() {
		SeleniumCommands.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
