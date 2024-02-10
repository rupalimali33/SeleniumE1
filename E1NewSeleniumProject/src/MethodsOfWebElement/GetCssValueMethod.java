package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://127.0.0.1:8081/login.do");
	   
	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
	    String cssValue = loginbutton.getCssValue("background");//To get the css value used for background
	    System.out.println(cssValue);//to print the recived value in consol
	    
	    String color =loginbutton.getCssValue("color");//To get the color(value) of login button
	    System.out.println(color);
	    }

}
