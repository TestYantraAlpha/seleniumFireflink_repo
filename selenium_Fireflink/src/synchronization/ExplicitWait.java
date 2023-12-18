package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
		
		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkButton = driver.findElement(By.id("Check"));
		
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.pollingEvery(Duration.ofMillis(200));
		fwait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}
}
