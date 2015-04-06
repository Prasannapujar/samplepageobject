package org.prasanna.pages;

import org.openqa.selenium.WebDriver;

/**
* This is the base class that every page class has to implement
* 
*
* @author  prasanna
* @version 1.0
* @since   2015-04-06 
*/

public  class Page {
	
	public WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
