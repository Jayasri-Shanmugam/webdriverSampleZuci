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
import org.testng.asserts.SoftAssert;

public class AssertTest {
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
	  
	  //Assert.assertEquals(driver.getTitle(),"Google Page"); execution stops here
	  
	  SoftAssert softAssert=new SoftAssert();
	  
	  softAssert.assertEquals(driver.getTitle(),"Google Page");
	  
	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
	  
	  searchbox.sendKeys("Java Tutorial");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  
//	  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	  
	  softAssert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	  
	  softAssert.assertAll();
	 
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
