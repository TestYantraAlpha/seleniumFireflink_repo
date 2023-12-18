package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.name("q")).getSize();
		System.out.println("height: "+size.getHeight());
		System.out.println("width: "+size.getWidth());
	}

}
