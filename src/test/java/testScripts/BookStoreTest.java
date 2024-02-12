package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookStoreTest 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://automationbookstore.dev/");
	  
	  WebElement msg = driver.findElement(By.id("searchBar"));
	  
	  msg.sendKeys("Test");
	  
	  WebElement icon = driver.findElement(By.linkText("Clear text"));
	  
	  if(icon.isDisplayed())
	  {
		  icon.click();
		  
		  System.out.println("Text Cleared");
	  }
	  else 
	  {
		  System.out.println("Clear Icon Hidden");
	  }
  }
}
