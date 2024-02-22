package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandaleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
	    driver.get("https://demoapps.qspiders.com/ui");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	    Thread.sleep(2000);
	    
	    WebElement disabledTextbox = driver.findElement(By.id("name"));
	    
	    //To typecast into JavasriptExecutor
	    JavascriptExecutor js=(JavascriptExecutor)driver;//To typecast from WebDriver to JavascriptExecutor interface
	    
	    //To pass input to Disabled Element
	    js.executeScript("document.getElementById('name').value='admin'");
	    Thread.sleep(2000);
	    
	    //To clear the content from a disabled Textbox
	  //  js.executeScript("document.getElementById('name').value=''");
	    
	    js.executeScript("arguments[0].value=''",disabledTextbox);
	}

}
