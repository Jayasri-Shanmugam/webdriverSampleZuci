package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest 
{
  @Test
  
  public void dropDown()
  {
	  
      WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	  
	  Select singleselect=new Select(driver.findElement(By.id("select-demo")));
	  
	  singleselect.selectByValue("Friday");
	  
	  Select multiselect=new Select(driver.findElement(By.id("multi-select")));
	  
	  if(multiselect.isMultiple())
		  
	  {
		  multiselect.selectByIndex(0);
		  multiselect.selectByValue("Florida");
		  multiselect.selectByVisibleText("Washington");
		  
	  }
	  
	  List<WebElement> items=multiselect.getAllSelectedOptions();
	  
	  System.out.println("The list of the items that is selected: "+items.size());
	  
	  System.out.println("Selected Options are: ");
	  
	  for(WebElement e:items)
		  
	  {
		  
		  System.out.println(e.getText());
		  
	  } 
	  
	  multiselect.deselectByValue("Florida");
	  
  }



}
