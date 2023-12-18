package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{
	@Test
	public void addProductToCart() {
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../..//input")).click();
		Reporter.log("Product added to cart successfully...!!",true);
	}
}
