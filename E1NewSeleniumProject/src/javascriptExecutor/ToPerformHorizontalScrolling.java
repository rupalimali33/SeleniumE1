package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
	    driver.get("https://omayo.blogspot.com/");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from WebDriver to JavascriptExecutor interface
	    
	    //To perform Scroll-Right Operation
	    js.executeScript("window.scrollBy(500,0)");
	    Thread.sleep(2000);
	    
	    //To perform Scroll-Left Operation
	    js.executeScript("window.scrollBy(-150,0)");
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}

}
