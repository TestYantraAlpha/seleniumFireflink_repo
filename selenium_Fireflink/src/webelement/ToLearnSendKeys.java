package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		WebElement searchTextField = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
		searchTextField.sendKeys("mobiles",Keys.ENTER);
	}

}
