package learningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test(priority = 1)
  public void login() {
	  //System.out.println("This is Login Method");
	  Reporter.log("This is Login Method" , true);
  }
  
  @Test(priority = 2)
  public void addToCart() {
	// System.out.println("This is AddTocart Method" );
	 Reporter.log("This is AddTocart Method" , true);
  }
  
  @Test(priority = 3)
  public void loginOut() {
	 // System.out.println("This is LoginOut Method");
	  Reporter.log("This is LoginOut Method" , true);
  }
  
}
