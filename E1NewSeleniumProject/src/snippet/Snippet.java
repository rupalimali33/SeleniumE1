package snippet;

public class Snippet {
	// To capture all the options 
			List<WebElement> options = driver.findElements(By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));
	
			// To print all the Options using for loop
			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
			}
	
			Thread.sleep(1000);
			driver.close();
}

