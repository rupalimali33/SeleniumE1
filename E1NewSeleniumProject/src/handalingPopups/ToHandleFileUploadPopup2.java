package handalingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//To provide Implicit wait
		    driver.get("https://w3schools.com/howto_html_file_button.asp");
		    Thread.sleep(2000);
		    
            WebElement fileUploadButton= driver.findElement(By.id("myFile"));
		    
		    Actions act = new Actions(driver);
		    act.click(fileUploadButton).perform();
		    Thread.sleep(2000);
		    
		    Runtime.getRuntime().exec("./autoItPrograms/w3Schools.exe");
		    
		    //Useing Send Keys
		    //driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\druja\\Desktop\\Poonam resume.docx");
		    
		
	}

}
