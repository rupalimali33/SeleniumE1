package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "This method is for login",priority = 1)
  public void login() 
  {
	  Reporter.log("Login Method" , true);
  }
  
  @Test(description = "This method is for Add To Cart",priority = 2)
  public void addToCart() 
  {
	  Reporter.log("Add To Cart Method" , true);
  }
  
  @Test(description = "This method is for logout",priority = 3)
  public void logout() 
  {
	 Reporter.log("Logout Method" ,true); 
  }
}
