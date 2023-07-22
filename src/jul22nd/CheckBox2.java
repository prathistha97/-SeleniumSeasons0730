package jul22nd;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox2 {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}

	@Test
	public void radioButtonTest() throws IOException, InterruptedException
	{
		
		
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected(), false);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected(), true);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected(), false);	 
	  
	  List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//td[@class='table5']/input"));
	  
	  for(WebElement checkbox:allCheckBoxes)
	  {
		  if(!checkbox.isSelected())
		  {
			  checkbox.click();
			  
			  Thread.sleep(3000);
		  }
	  }
	  
	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected(), true);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected(), true);	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected(), true);	
	
		
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
