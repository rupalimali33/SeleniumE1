package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
	    driver.get("https://www.selenium.dev/");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;//To typecast from WebDriver to JavascriptExecutor interface
	    
	    //To perform scroll-down operation
	    js.executeScript("window.scrollBy(0,1000)");//To 
	    Thread.sleep(2000);
	    
	    //To perform scroll-up operation
	    js.executeScript("window.scrollBy(-500,0)");
	    Thread.sleep(2000);

	}

}
