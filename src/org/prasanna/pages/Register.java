/**
 * 
 */
package org.prasanna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This Represent the Registration page class
 * @author Prasanna
 *
 */
public class Register extends Headers {
	
	public static String Firstname_name="firstName";
	public static String Last_name="lastName";
	public static String username_name="email";
	public static String password_name="password";
	public static String coinfirmpassword_name="confirmPassword";
	

	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean Verifypage() {
		// TODO Auto-generated method stub
		return true
				;
	}
	
	public void enterfirstname(String firstname)
	{
		driver.findElement(By.name(Firstname_name)).sendKeys(firstname);
	}
	
	public void enterlastname(String lastname)
	{
		driver.findElement(By.name(Last_name)).sendKeys(lastname);
	}
	
	public void enterusername(String username)
	{
		driver.findElement(By.name(username_name)).sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(By.name(password_name)).sendKeys(password);
	}
	
	public void entercoinfrimpassword(String coinfirmpassword)
	{
		driver.findElement(By.name(coinfirmpassword_name)).sendKeys(coinfirmpassword);
	}
	
	public accountsucess submittheregister()
	{
		driver.findElement(By.name("register")).click();
		//new PageFactory();
		return PageFactory.initElements(driver, accountsucess.class);
		
	}
	
	public accountsucess regsiter1()
	{
		accountsucess s1;
		enterfirstname("Prasanna");
		enterlastname("pujar");
		enterusername("pup1kor");
		enterpassword("123");
		entercoinfrimpassword("123");
		s1=submittheregister();
		return s1;
		
		
	}
	

}
