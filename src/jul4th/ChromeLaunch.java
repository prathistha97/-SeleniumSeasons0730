package jul4th;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\003 Live Tech\\softwares\\chromedriver_win32 (3)\\chromedriver.exe");
		new ChromeDriver();

	}

}
