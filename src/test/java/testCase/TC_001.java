package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.HomePage;
import pageObjects.accountregpage;

public class TC_001 extends baseclass{
 
  @Test
  void validation()
  {
	  logs.info("sadjfasdhd");
	  HomePage hp=new HomePage(test);
	  hp.clickaccount();
hp.clickreg();
  }
  @Test
  void valtwo() throws InterruptedException
  {
	  logs.debug("debug logs");;
	  accountregpage ap=new accountregpage(test);
	  logs.debug("checking first page");
Thread.sleep(1000);
	  ap.setfirstname(randomalpha());
	  Thread.sleep(1000);

	  ap.setlastname(randomalpha());
	  ap.setemail(randomalpha()+"@gmail.com");
	  ap.setphone(randomnum());
	 String passss= alphanumeric();
	  logs.debug("checking first page");
	  Thread.sleep(1000);

	  ap.setpassword(passss);
	  Thread.sleep(1000);

	  ap.setconfpass(passss);
	  ap.clickcheckbox();
	  ap.clickcontinue();
	String abc=  ap.getssdmsg();
	  Assert.assertEquals(abc, "Your Account Has Been Created!");
	  logs.debug("checking first page");	  
	  System.out.println(randomalpha());
	  System.out.println(passss);


	  
  }
  
 
}
