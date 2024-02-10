package AssignmentNo5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://trello.com/home");
	    
	    Actions act=new Actions(driver);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("username")).sendKeys("rupalimali33@gmail.com");	
	    driver.findElement(By.xpath("//span[text()='Continue']")).click();
	    driver.findElement(By.id("password")).sendKeys("Rupali@123");
	    driver.findElement(By.xpath("//span[text()='Log in']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Mock']")));
	    driver.findElement(By.xpath("//div[text()='Mock']")).click();
	    
	//Source Element
	WebElement sqlSource=driver.findElement(By.xpath("//a[text()='SQL']"));
	WebElement javaSource=driver.findElement(By.xpath("//a[text()='Java']"));
	WebElement manualTestingSource=driver.findElement(By.xpath("//a[text()='Manual Testing']"));
	WebElement APISource=driver.findElement(By.xpath("//a[text()='API']"));
	WebElement SeleniumSource=driver.findElement(By.xpath("//a[text()='Selenium']"));
	
	//Target Elements
	
	WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
	WebElement mockPendingTarget = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
	WebElement mockScheduledTarget = driver.findElement(By.xpath("//h2[text()='Mock Scheduled']"));
	
	Actions dragAndDrop = act.dragAndDrop(sqlSource, mockGivenTarget);
	dragAndDrop.perform();
	
	act.dragAndDrop(javaSource, mockGivenTarget).perform();
	
	act.dragAndDrop(manualTestingSource, mockGivenTarget).perform();
	
	act.dragAndDrop(APISource, mockPendingTarget).perform();
	
	act.dragAndDrop(SeleniumSource, mockScheduledTarget).perform();
	
	
	//To perform ContextClick Operation
	WebElement contextElement = driver.findElement(By.xpath("//a[text()='SQL']"));
	act.contextClick(contextElement).perform();
	
	//List<WebElement> options = driver.findElements(By.xpath(null))
	
	//List<WebElement> options1 = driver.findElements((By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));
	

	}

}
