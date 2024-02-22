package handalingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
		    driver.get("https://omayo.blogspot.com/");
		    Thread.sleep(2000);
		    
		    WebElement fileUpload= driver.findElement(By.id("uploadfile"));
		    
		    Actions act = new Actions(driver);
		    act.click(fileUpload).perform();  //To click on Choose File Button
		    Thread.sleep(2000);
		    
		    //To handle upload popup by passing the relative path of file
		    Runtime.getRuntime().exec("./autoItPrograms/Fileupload.exe");
		    }

}
