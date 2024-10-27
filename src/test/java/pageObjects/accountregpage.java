package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountregpage extends BasePage
{
	public accountregpage(WebDriver test)
	{
		super(test);
	}
	@FindBy(xpath="//*[@id=\"input-firstname\"]") WebElement fname;
	@FindBy(xpath="//*[@id=\"input-lastname\"]") WebElement lname;
	@FindBy(xpath="//*[@id=\"input-email\"]") WebElement email;
	@FindBy(xpath="//*[@id=\"input-telephone\"]") WebElement tphone;
	@FindBy(xpath="//*[@id=\"input-password\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"input-confirm\"]") WebElement cpassword;
	@FindBy(xpath="//input[@name=\"agree\"]") WebElement checkbox;
	@FindBy(xpath="//input[@value=\"Continue\"]") WebElement cotinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement getmessage;


public void setfirstname(String finame)
{
	fname.sendKeys(finame);
}
public void setlastname(String lsname)
{
	lname.sendKeys(lsname);
}
public void setemail(String emal)
{
	email.sendKeys(emal);
}
public void setphone(String phn)
{
	tphone.sendKeys(phn);
}	
public void setpassword(String pss)
{
	password.sendKeys(pss);
}
public void setconfpass(String cpass)
{
	cpassword.sendKeys(cpass);
}
public void clickcheckbox()
{
	checkbox.click();
}
public void clickcontinue()
{
	cotinue.click();
}
public String getssdmsg(){	
		return(getmessage.getText());	
}

}