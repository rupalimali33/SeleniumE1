package takesScreennshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver= new ChromeDriver(); //To store the reference with RemoteWebDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.amazon.com/");
	    
	    
	    File src=driver.getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("./screenshots/Amazon.jpg");//
	    
	    Files.copy(src, dest); //To copy and paste the screenshot in the specified folder
	    
	}

}
