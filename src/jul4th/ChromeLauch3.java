package jul4th;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLauch3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		new ChromeDriver();
		

	}

}
