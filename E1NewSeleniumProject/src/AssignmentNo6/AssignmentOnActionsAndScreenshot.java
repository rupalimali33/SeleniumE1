package AssignmentNo6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnActionsAndScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://www.bluestone.com");
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    driver.findElement(By.id("denyBTn")).click();
	    
	    WebElement coins = driver.findElement(By.xpath("//a[text()='Coins']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(coins).perform();
	    driver.findElement(By.xpath("//span[text()='1 gram']"))
	    coinsLink.click();
	    
	    WebElement coinElement = 
	    
	    
	    
		 
	}

}
