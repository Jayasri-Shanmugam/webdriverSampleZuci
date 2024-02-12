package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrameJQuery {
  @Test
  public void f() 
  {
 WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  driver.switchTo().frame("mce_0_ifr");
	  driver.findElement(By.tagName("p")).sendKeys(" SDET Training ");
	  
	  driver.switchTo().defaultContent();
	  
	  driver.findElement(By.linkText("Powered by Tiny")).click();
	  
  }
}
