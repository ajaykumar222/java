package inetBankingv1.inetBankingv1;

import org.testng.annotations.Test;

public class testngpriorioty {
	
	@Test(priority=1)
	void method() {
		System.out.println("this is test1");
		}
	@Test(priority=2)
	void method2() {
		System.out.println("this is test1");
		}
	@Test(priority=3)
	void method3() {
		System.out.println("this is test1");
		}
	@Test(priority=4,enabled=false)
	void method4() {
		System.out.println("this is test1");
		}

}
