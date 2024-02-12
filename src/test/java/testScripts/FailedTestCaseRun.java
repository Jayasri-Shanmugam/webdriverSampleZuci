package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FailedTestCaseRun {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{	
		driver=new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
  @Test
  public void java() 
  {
	   
	  driver.get("https://www.google.com/");
	  
	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
	  
	  searchbox.sendKeys("Java Tutorial");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  
	  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search Engine");
	 
  }
@Test
  
  public void selenium() 
  {
	  
	  driver.get("https://www.google.com/");
	  
	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
	  
	  searchbox.sendKeys("Selenium Tutorial");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  
	  Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
	 
  }
@AfterTest
public void end()
{
	driver.close();
}
}
