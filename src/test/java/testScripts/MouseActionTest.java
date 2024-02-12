package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionTest 
{
  @Test
  
  public void actionTest() throws InterruptedException
  
  {
	  
	WebDriver driver=new ChromeDriver();
	
	Actions actions=new Actions(driver);
	
	driver.manage().window().maximize();
	
//	driver.get("https://automationbookstore.dev/");//1
//	
//	WebElement searchbox=driver.findElement(By.id("searchBar"));
//	
//	actions.contextClick(searchbox).perform();
	
	
	
	
	
//	driver.get("https://demo.opencart.com");//2
//	
//	WebElement menu=driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));
//	
//	actions.contextClick(menu).perform();
	
	
	
	
	
	//DOUBLE CLICK 
	
//	driver.get("https://stqatools.com/demo/DoubleClick.php");
//	
//	Thread.sleep(2000);
//	
//	WebElement button=driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
//	
//	actions.doubleClick(button).perform();
//	
//	actions.doubleClick(button).doubleClick(button).click().perform();
	
	
	
	
	
	//MOUSE HOVER ACTIONS
	
	driver.get("https://stqatools.com/demo/MouseHover.php");
	
	WebElement menu=driver.findElement(By.cssSelector("button.dropbtn"));
	
	actions.moveToElement(menu).perform();
	
	WebElement menuItem=driver.findElement(By.cssSelector("div.dropdown-content >a:nth-child(1)"));
	
	//actions.click(menuItem).perform();
	
	actions.moveToElement(menu).click(menuItem).build().perform();
	  
  }
  
}
