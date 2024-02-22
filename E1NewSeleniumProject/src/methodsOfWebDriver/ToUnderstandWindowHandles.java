package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String wh : allWindows)
		{
			driver.switchTo().window(wh);
			
			if(!driver.getTitle().equals("omayo (QAFox.com)"))
			{
				driver.close();
			}
				
		}

	}
	

}
