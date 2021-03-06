package sevenchats_V1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		File src= new File("./Configurations/config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String URL = pro.getProperty("baseurl");
		return URL;
		
	}
	public String getUserName()
	{
		String UserName = pro.getProperty("username");
		return UserName;
		
	}
	public String getPassword()
	{
		String Password = pro.getProperty("password");
		return Password;
		
	}
	public String getChromePath()
	{
		String Chrome = pro.getProperty("chromepath");
		return Chrome;
		
	}
	public String getFirefoxpath()
	{
		String FireFox = pro.getProperty("Firefox");
		return FireFox;
		
	}
	public String getfname()
	{
		String Fname = pro.getProperty("fname");
		return Fname;
		
	}
	public String getlname()
	{
		String Lname = pro.getProperty("lname");
		return Lname;
		
	}
	public String getemail()
	{
		String Email = pro.getProperty("email");
		return Email;
		
	}
	public String getGender()
	{
		String gender = pro.getProperty("Gender");
		return gender;
		
	}
	public String getPass()
	{
		String pass = pro.getProperty("Password");
		return pass;
		
	}
	public String getcpassword()
	{
		String Cpassword = pro.getProperty("cpassword");
		return Cpassword;
		
	}
	public String getMobileno()
	{
		String MobileNo = pro.getProperty("Mobileno");
		return MobileNo;
		
	}
	
	
	

}
