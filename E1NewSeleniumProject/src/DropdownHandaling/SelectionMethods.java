package DropdownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("file:///C:/Users/druja/Desktop/HTMP%20Programs/SingleSelectDD.html");
	    
	    WebElement singleSelectDD=driver.findElement(By.id("menu"));
	    
	    Select sel=new Select(singleSelectDD);
	    
	    sel.selectByIndex(1);
	    Thread.sleep(1000);
	    
	    sel.selectByValue("v2");
	    Thread.sleep(1000);
	    
	    sel.selectByVisibleText("WadaPav");
	    Thread.sleep(1000);
	    
	    
	}

}
