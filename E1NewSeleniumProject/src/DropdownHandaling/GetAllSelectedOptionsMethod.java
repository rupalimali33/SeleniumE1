package DropdownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       driver.get("file:///C:/Users/druja/Desktop/HTMP%20Programs/MultiselectDD.html");
	 
	       WebElement multiSelectDD = driver.findElement(By.id("menu"));
		   Select sel = new Select(multiSelectDD);
	       
		   for(int i=2;i<=4;i++)
		   {
			   sel.selectByIndex(i);
		   }
		   List<WebElement>allSelectedOptions=sel.getAllSelectedOptions();
		   
		   for(WebElement we:allSelectedOptions)
		   {
			   String selectedOptions=we.getText();
			   System.out.println(selectedOptions);
		   }
		   
	}

}
