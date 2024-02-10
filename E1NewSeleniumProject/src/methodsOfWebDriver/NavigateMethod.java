package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://flipcart.com/");	
		 
		 Thread.sleep(3000);
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 driver.navigate().back(); //To navigate backword
		 
		 Thread.sleep(1000);

		 driver.navigate().forward();  //To navigate forword 
		 
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();  //To refresh the web page

	}

}
