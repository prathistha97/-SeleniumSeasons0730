package jul22nd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
	}

	@Test
	public void webTableTest() throws IOException
	{
		
	
		String part1="//table/tbody/tr[";

		String part2="]/td[1]/a";
		
		for(int i=1;i<=36;i++)
		{
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}

	
		
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
