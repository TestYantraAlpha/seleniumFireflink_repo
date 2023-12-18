package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Apple {
	
	@Test(groups = "smoke")
	public void launchApple() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/");
		Reporter.log("Navigated to apple...",true);
	}
}
