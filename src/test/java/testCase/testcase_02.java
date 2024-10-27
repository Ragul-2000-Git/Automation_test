package testCase;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginpom;

public class testcase_02 extends baseclass {
@Test
public void login_test()
{
	HomePage hp=new HomePage(test);
	hp.clickaccount();
	hp.login();
	loginpom nn=new loginpom(test);
	nn.us("VFHXi@gmail.com");
	nn.ps("ZSvLg@75006");
	nn.lg();
	
}

}
