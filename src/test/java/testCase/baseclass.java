package testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {
	public	WebDriver test;
	public Logger logs;
	public Properties p;

	@BeforeTest
	 @Parameters({"os","test"})
	 public void setup( String os,String testt) throws IOException
	  {
		if(p.getProperty("environment").equals("remote"))
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			if(os.equals("windows"))
			{
				cap.setPlatform(Platform.WIN11);
			}
			switch (testt)
			 {
			 case "chrome":cap.setBrowserName("chrome");break;
			 default: System.out.println("invalid browser");return;
			 
			 }
			test=new RemoteWebDriver(new URL(" http://192.168.209.209:4444"),cap);
			
		}
		if(p.getProperty("environment").equalsIgnoreCase("local"))
		{
		 switch (testt)
		 {
		 case "chrome":test=new ChromeDriver();break;
		 case "edge": test=new EdgeDriver();break;
		 default: System.out.println("invalid browser");return;
		 }
		 }
		 FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(fs);
		 
		 logs=LogManager.getLogger(this.getClass());
		  test.get(p.getProperty("appurl"));
		  test.manage().window().maximize();
		  test.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	 
	  }
	 public String randomalpha()
	  {
		 String a= RandomStringUtils.randomAlphabetic(5);
		 return a;
	  }
	  public String randomnum()
	  {
		String b=  RandomStringUtils.randomNumeric(10);
		return b;
	  }
	  public String alphanumeric()
	  {
	String c=	  RandomStringUtils.randomAlphabetic(5);
		String d=  RandomStringUtils.randomNumeric(5);
		return(c+"@"+d);
	  }
}
