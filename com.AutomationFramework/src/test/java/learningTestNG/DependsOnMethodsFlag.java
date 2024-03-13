package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag {
  @Test
  public void login() 
  {
	  Reporter.log("Login Method",true);
  }
  
  @Test(dependsOnMethods = "login")
  public void addToCart() 
  {
	  Reporter.log("Add To Cart Method",true);
  }
  
  @Test(dependsOnMethods = "addToCart")
  public void logout() 
  {
	  Reporter.log("Loout Method",true);
  }
  
}
