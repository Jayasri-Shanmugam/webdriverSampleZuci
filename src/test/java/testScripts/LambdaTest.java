package testScripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LambdaTest
{
  @Test
      public void lambdaPageTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.lambdatest.com/blog/");
	  
	  List<WebElement> items = driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[.//a[text()='Playwright Testing']]/preceding-sibling::li"));
			  
	  System.out.println("No of items before playwright :" +items.size());
	  
	 
	  
	  for(WebElement element:items)
		  
	  {
		  
		  System.out.println(element.getText());
		  
	  }
	  List<WebElement> item = driver.findElements( By.xpath("//ul[@id='menu-side-menu']//li[.//a[text()='Playwright Testing']]/following-sibling::li"));
	  
	  System.out.println("No of items after playwright :" +item.size());
	 
	  
	  for(WebElement element:item)
		  
	  {
		  
		  System.out.println(element.getText());
		  
	  }

  }

	  
  }

