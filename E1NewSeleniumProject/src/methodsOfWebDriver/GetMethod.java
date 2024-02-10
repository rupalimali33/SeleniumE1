package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //To Lunch Chrome Browser
	     
	     driver.get("https://www.amazon.com/"); //To lunch the application

	}

}
