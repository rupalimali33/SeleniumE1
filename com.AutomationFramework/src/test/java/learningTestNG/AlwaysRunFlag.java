package learningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
  @Test
  public void login() 
  {
	  Assert.fail();
	  Reporter.log("Login Method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void addToCart() 
  {
	  Reporter.log("Add To Cart Method",true);
  }
  
  
  @Test(dependsOnMethods = "addToCart" , alwaysRun= true)
  public void logout() 
  {
	  Reporter.log("Logout Method",true);
  }
  
}
