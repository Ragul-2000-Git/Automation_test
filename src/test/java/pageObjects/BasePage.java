package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
 public WebDriver wb;
	BasePage(WebDriver test)
	{
		wb=test;
		PageFactory.initElements(test, this);
	}
}
