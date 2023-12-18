package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		Thread.sleep(2000);
		alertPopup.accept();
//		alertPopup.dismiss();
		driver.findElement(By.linkText("Log in")).click();
	}
}
