package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpWaitTest
{
  @Test
  public void explicitWait()
  {
      WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://uitestingplayground.com/ajax");
	  
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));//time 15sec  10-failure 
	  
	  driver.findElement(By.id("ajaxButton")).click();
	  
	  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
	  
	  String text=driver.findElement(By.cssSelector("div#content")).getText();
	  
	  System.out.println(text);
  }
}
