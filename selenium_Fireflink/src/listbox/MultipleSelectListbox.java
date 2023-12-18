package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(listbox);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("99");
		priceSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		Thread.sleep(2000);
//		priceSelect.deselectAll();
//		System.out.println(priceSelect.getFirstSelectedOption().getText());
//		List<WebElement> allSelectedOptions = priceSelect.getAllSelectedOptions();
//		
//		for(WebElement option:allSelectedOptions) {
//			System.out.println(option.getText());
//		}
		List<WebElement> allOptions = priceSelect.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		System.out.println(priceSelect.isMultiple());
	}
}