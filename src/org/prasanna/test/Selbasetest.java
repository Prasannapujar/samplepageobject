
package org.prasanna.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * this is the base testclass that every test class has to implement 
 * @author Prasanna
 *
 */
public class Selbasetest {
	public WebDriver d;

	  @Parameters({"Browser","URL"})
	  @BeforeMethod
	  public void LaunchBrowser(@Optional("Firefox")String b,@Optional("http://newtours.demoaut.com/mercuryregister.php")String url) {
		  
		  System.out.println("Running the Launch Browser");
		  if(b.equalsIgnoreCase("Firefox"))
		  {
			  System.out.println("Ruuning Firefox");
			  d=new FirefoxDriver();
			  d.get(url);
		  }
		  else
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Work\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
			  d=new ChromeDriver();
			  d.get(url);
		  }
	  }

	  @AfterMethod
	  public void closebrowser() {
		  System.out.println("Running the close Browser ");
		  d.close();
	  }

}
