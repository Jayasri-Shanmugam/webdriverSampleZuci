package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumEasyTest 
{
  @Test
  public void automateForms() throws InterruptedException
  {

	  WebDriver driver = new ChromeDriver(); 
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html"); 	
	  
	  WebElement msg= driver.findElement( By.id("user-message")); 	
	  
	  msg.sendKeys("Message to be displayed"); 	 
	  
	  WebElement showMsg = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")); 
	  
	  showMsg.click(); 	
	  
	  WebElement a = driver.findElement( By.id ("value1")); 	
	  
	  a.sendKeys("28"); 	
	  
	  WebElement b = driver.findElement( By.id ("value2")); 
	  
      b.sendKeys("5"); 	 
      
      WebElement getTotal = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")); 
      
      getTotal.click();
  }
}
