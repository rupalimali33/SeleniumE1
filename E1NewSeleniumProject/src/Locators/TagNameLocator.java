package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/druja/Desktop/HTML%20Programs/Textbox.html");
		Thread.sleep(2000);
		
		WebElement textBox=driver.findElement(By.tagName("input"));
		textBox.sendKeys("manager");
		Thread.sleep(2000);
		driver.close();
	}

}
