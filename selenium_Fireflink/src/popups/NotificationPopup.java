package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions setting=new ChromeOptions();//browser setting
//		setting.addArguments("--disable-notifications");// add chromium commands
		setting.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(setting);// pass settings to constructor
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");	
	}
}