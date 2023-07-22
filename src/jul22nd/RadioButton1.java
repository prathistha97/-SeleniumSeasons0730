package jul22nd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1 {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}

	@Test
	public void radioButtonTest() throws IOException
	{
		
		
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected(), false);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected(), true);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected(), false);	 
	
		
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
