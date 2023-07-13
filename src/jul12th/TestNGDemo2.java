package jul12th;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class TestNGDemo2 {
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser closed..");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
	}
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("Login Successful...");
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Registration Successful...");
		
	}
	
	@Test(priority=3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Password changed Successful...");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
