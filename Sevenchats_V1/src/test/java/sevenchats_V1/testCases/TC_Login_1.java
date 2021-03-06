package sevenchats_V1.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import sevenchats_V1.pageobjects.BaseClass;
import sevenchats_V1.pageobjects.LoginPage;

public class TC_Login_1 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Usernane");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		
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
