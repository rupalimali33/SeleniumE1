package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	public class EnableFlag {
		 
		@Test(priority = 1)
		  public void login() 
		  {
			  Reporter.log("Login Method" , true);
		  }
		  
		  @Test(priority = 2 , invocationCount = 5)
		  public void addToCart() 
		  {
			  Reporter.log("Add To Cart Method" , true);
		  }
		  
		  @Test(priority = 3)
		  public void logout() 
		  {
			 Reporter.log("Logout Method" ,true); 
		  }
		}
}
