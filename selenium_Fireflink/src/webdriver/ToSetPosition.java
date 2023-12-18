package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://skillrary.com/");
		driver.manage().window().setPosition(new Point(250, 250));
	}
}