/**
 * 
 */
package org.prasanna.test;


import org.prasanna.pages.Register;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Prasanna
 *
 */
public class TestRegister extends Selbasetest {
	
	@Test
	public void Singuptest()
	{
		System.out.println("Running the Test method");
		String Expected="Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		Register r=new Register(d);
		r.regsiter1();
		//Assert.assertEquals(actual, expected);
	//	Assert.assertTrue(Expected.contains(d.findElement(by.)));
	}

}
