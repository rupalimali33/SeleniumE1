package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableFlag {
	  @Test(enabled = true)
	  public void login() 
	  {
		  Reporter.log("Login Method" , true);
	  }
	  
	  @Test(enabled = false)
	  public void addToCart() 
	  {
		  Reporter.log("Add To Cart Method" , true);
	  }
	  
	  @Test(enabled = true)
	  public void logout() 
	  {
		 Reporter.log("Logout Method" ,true); 
	  }
	}
