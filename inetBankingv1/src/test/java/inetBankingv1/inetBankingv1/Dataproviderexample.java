package inetBankingv1.inetBankingv1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {
	
	@Test(dataProvider="LogindataProvider")
	public void loginTest(String email, String pwd)
	{
		System.out.println(email+"  "+pwd);
	}
	
	@DataProvider(name="LogindataProvider")
	public Object[][] getdata(){
		Object[][] data= {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mnp@gmail.com","mno"}};
		return data;
	}

}
