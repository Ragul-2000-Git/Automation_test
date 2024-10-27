package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage (WebDriver test)
	{
		super(test);
	}
  @FindBy(xpath="//span[text()='My Account']") WebElement linkacc;
  @FindBy(xpath="//a[text()='Register']") WebElement reg;
  @FindBy(xpath="//a[normalize-space()='Login']") WebElement cc;
  
  public void clickaccount()
  {
	  linkacc.click();
  }
  public void clickreg()
  {
	  reg.click();
  }
  public void login ()
  {
	  cc.click();
  }

}
