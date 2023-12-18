package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		WebElement errorMsg = driver.findElement(By.id("validationMessage"));
		System.out.println(errorMsg.getCssValue("color"));
		System.out.println(errorMsg.getCssValue("font-size"));
		System.out.println(errorMsg.getTagName());
	}
}
