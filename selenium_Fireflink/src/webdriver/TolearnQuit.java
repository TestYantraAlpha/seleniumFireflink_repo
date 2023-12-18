package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		driver.quit();
	}
}
