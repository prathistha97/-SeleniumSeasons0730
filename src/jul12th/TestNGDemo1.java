package jul12th;

import org.testng.annotations.Test;

import graphql.Assert;

public class TestNGDemo1 {
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		Assert.assertTrue(true);
		System.out.println("Login Successful...");
		System.out.println("Browser closed..");
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Registration Successful...");
		System.out.println("Browser closed..");
	}
	
	@Test(priority=3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Password changed Successful...");
		System.out.println("Browser closed..");
	}
	
	
	
	
	
	
	
	
	
	
	

}
