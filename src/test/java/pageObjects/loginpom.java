package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpom extends BasePage {
 public loginpom(WebDriver test)
 {
		super(test);

 }
 
 @FindBy(xpath="//input[@id=\"input-email\"]") WebElement user;
 @FindBy(xpath="//input[@id=\"input-password\"]") WebElement pass;
 @FindBy(xpath="//input[@value=\"Login\"]") WebElement login;
 
 public void us(String u)
 {
	 user.sendKeys(u);
 }
 public void ps(String p)
 {
	 pass.sendKeys(p);
 }
 public void lg()
 {
	 login.click();
 }
 
}
