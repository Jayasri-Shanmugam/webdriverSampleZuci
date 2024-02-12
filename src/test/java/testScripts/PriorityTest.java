package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=2)
	  
	  public void java() 
	  
	  {
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://www.google.com/");
		  
		  WebElement searchbox=driver.findElement(By.id("APjFqb"));
		  
		  searchbox.sendKeys("Java Tutorial");
		  
		  searchbox.sendKeys(Keys.ENTER);
		  
		  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	  }
	@Test(priority=1)
	  
	  public void selenium() 
	  {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://www.google.com/");
		  
		  WebElement searchbox=driver.findElement(By.id("APjFqb"));
		  
		  searchbox.sendKeys("Selenium Tutorial");
		  
		  searchbox.sendKeys(Keys.ENTER);
		  
		  Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
	  }
	@Test(priority=3)


	  public void cucumber() 
	  {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://www.google.com/");
		  
		  WebElement searchbox=driver.findElement(By.id("APjFqb"));
		  
		  searchbox.sendKeys("Cucumber Tutorial");
		  
		  searchbox.sendKeys(Keys.ENTER);
		  
		  Assert.assertEquals(driver.getTitle(),"Cucumber Tutorial - Google Search");
	  }
}
