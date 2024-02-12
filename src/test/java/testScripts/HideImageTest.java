package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class HideImageTest
{
  @Test
  public void hideImage() 
  {
	  ChromeOptions options=new ChromeOptions();
	  
	  //method 1 -this will disable image loading
	  
	  options.addArguments("--blink-settings=imageEnabled=false");
	  
	  //or alternatively we can set direct preference-method 2
	  
//	  Map<String , Object> prefs=new HashMap<>();
//	  
//	  prefs.put("profile.managed_default_content_settings.images",2);
//	  
//	  options.setExperimentalOption("Prefs", prefs);
//	  
//	  WebDriver driver=new ChromeDriver(options);
//	  
//	  driver.get("https://demo.opencart.com/");
  }
}
