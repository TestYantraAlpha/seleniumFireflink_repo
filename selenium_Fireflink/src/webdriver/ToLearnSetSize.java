package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://skillrary.com/");
		driver.manage().window().setSize(new Dimension(300, 500));
	}
}