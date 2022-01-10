package sevenchats_V1.pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import sevenchats_V1.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
    public String password =readconfig.getPassword() ;
    public String fname = readconfig.getfname();
    public String lname = readconfig.getlname();
    public String email = readconfig.getemail();
    public String Gender =readconfig.getGender();
    public String Password =readconfig.getPass();
    public String cpassword =readconfig.getcpassword();
    public String Mobileno =readconfig.getMobileno();
    public static WebDriver driver;
    public static Logger logger;
    
    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
    	
   logger=Logger.getLogger("Sevenchats_V1");
   PropertyConfigurator.configure("log4j.properties");
   
   
   if (br.equals("chrome"))
   {
	   
   
   System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
   driver=new ChromeDriver();
   }else
   {
	   System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
	   driver=new FirefoxDriver();
   }
   }
    
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }
    
    
    public void captureScreen(WebDriver driver,String tname)throws IOException{
    	TakesScreenshot ts =(TakesScreenshot) driver;
    	File source =ts.getScreenshotAs(OutputType.FILE);
    	File Target =new File(System.getProperty("user.dir")+"/Screenshots"+tname+".png");
    	FileUtils.copyFile(source, Target);
    	System.out.println("Screenshot Taken");
    }
    
    
    
}
