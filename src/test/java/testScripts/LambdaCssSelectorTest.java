package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LambdaCssSelectorTest 
{
  @Test
  public void f()
  {
      WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.lambdatest.com/blog/");
	  
	  driver.findElement(By.cssSelector("div.dropdown-menu"));
	  
	  driver.findElement(By.cssSelector("input[placeholder*='Search']"));
	  
	  
	  
  }
}
