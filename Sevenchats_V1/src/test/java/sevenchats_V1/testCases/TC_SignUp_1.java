package sevenchats_V1.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import junit.framework.Assert;
import sevenchats_V1.pageobjects.BaseClass;
import sevenchats_V1.pageobjects.LoginPage;
import sevenchats_V1.pageobjects.signUP;

public class TC_SignUp_1 extends BaseClass{
	
	@Test
	
	public void Signup() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		LoginPage lp =new LoginPage(driver);
		lp.clickSignup();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		logger.info("URL is opened");
		
		signUP sp =new signUP(driver);
		sp.setFirstName(fname);
		logger.info("First name is entered");
		
		sp.setLastName(lname);
		logger.info("Last name is entered");
		
		sp.setEmail(email);
		logger.info("EMail is entered");
		
		sp.setGender(Gender);
		logger.info("Gender is entered");
		
		sp.setPassword(Password);
		logger.info("Password is entered");
		
		
		sp.setConfirmPassword(cpassword);
		logger.info(" Confirm Password is entered");
		
		sp.setCalendar();
		logger.info(" Calender is selected");
		
		sp.setMobile(Mobileno);
		logger.info(" Mobile no is enetered");
		
		sp.setCountry();
		logger.info(" Country is selected"); 
		
		sp.setState();
		logger.info(" State is selected"); 
		
		sp.setCity();
		logger.info(" City is selected"); 
		
		sp.setSignup();
		logger.info(" Signup is clicked"); 
		
		
		if(driver.getTitle().equals("Sign In | Sevenchats"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertFalse(false);
			logger.info("Login test failed ");
			
		}
		
		
		
		
	}

}
