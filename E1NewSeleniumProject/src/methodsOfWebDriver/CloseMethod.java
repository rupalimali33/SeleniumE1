package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver = new ChromeDriver(); //To Lunch Chrome Browser
     Thread.sleep(5000);//To stop the execution for 5 sec.
     driver.close(); //To close the Browser Window

	}

}
