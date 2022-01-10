package RestAssured.Test;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng {
	Scanner v= new Scanner(System.in);
	@BeforeClass
	public void name()
	{
		
		System.out.println("Enter the no:");
	}

	
		
	
	@AfterClass
	public void over()
	{
		System.out.println("The executiuon eas complete");
	}
	
	@Test
	public void Number()
	{
		int number =v.nextInt();
		if(number%10 != 0)
		{
			System.out.println("The number enetered is not zero");
		}
	}
}


