package AssignmentNo4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.facebook.com/signup");
	  WebElement dayDropdown = driver.findElement(By.id("day"));
	  WebElement monthDropdown = driver.findElement(By.id("month"));
	  WebElement yearDropdown = driver.findElement(By.id("year"));
	  
	  Select daySelect=new Select(dayDropdown);
	  boolean result=daySelect.isMultiple();
	  System.out.println("dayDropdown is multiple ? : +result1");
	  
	//  List<WebElement> dayOptions=daySelect.getOptions();
	 // for(WebElement)
	}

}
