package FramesAssignmentNo7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		driver.findElement(By.className("M6CB1c rr4y5c")).click(); 
		
		
		
	}

}
