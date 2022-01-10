package sevenchats_V1.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sevenchats_V1.pageobjects.BaseClass;
import sevenchats_V1.pageobjects.LoginPage;
import sevenchats_V1.utilities.XLUtils;

public class TC_Login_2 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT() {
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
	}

	@DataProvider(name="LoginData")
	String [][] getData()
	{
		String path =System.getProperty("user.dir")+"/src/test/java/sevenchats_V1.testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
				
			}
		}
		return logindata;
	}
	
}
