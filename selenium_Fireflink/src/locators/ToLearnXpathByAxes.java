package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String movieName="Vikram";
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/HTML/Siblings.html");
		String collection = driver.findElement(By.xpath("//td[contains(text(),'"+movieName+"')]/following-sibling::td")).getText();
		String position = driver.findElement(By.xpath("//td[contains(text(),'"+movieName+"')]/preceding-sibling::td")).getText();
		System.out.println("Collection: "+collection);
		System.out.println("position: "+position);
	}
}
