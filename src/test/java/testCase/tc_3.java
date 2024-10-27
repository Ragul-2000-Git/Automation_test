package testCase;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginpom;
import utilities.dataptomtd;

public class tc_3 extends baseclass {
 @Test(dataProvider="dp",dataProviderClass=dataptomtd.class)
 void datatest(String abc,String bdc)
 {
	 HomePage hp=new HomePage(test);
	 hp.clickaccount();
	 hp.login();
	 
	/* loginpom lp=new loginpom(test);
	 lp.us(abc);
	 lp.ps(bdc);
	 lp.lg();*/
	 
 }
}
