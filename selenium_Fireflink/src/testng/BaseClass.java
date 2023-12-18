package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("open browser and navigate to url",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("login",true);
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout",true);
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		Reporter.log("Close browser",true);
	}
}
