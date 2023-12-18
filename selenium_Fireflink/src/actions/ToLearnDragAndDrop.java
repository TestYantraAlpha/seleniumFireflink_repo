package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement image = driver.findElement(By.id("drag1"));
		WebElement dest = driver.findElement(By.id("div2"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(image, dest).perform();
	}

}
