package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillPerticularWebElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
	    driver.get("https://selenium.dev.com/");
	    
	   WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from WebDriver to JavascriptExecutor interface
	    js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);

	}

}
