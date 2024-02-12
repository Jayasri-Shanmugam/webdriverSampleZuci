package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWinTest 
{
  @Test
  
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://stqatools.com/demo/Windows.php");
	  
	  String parentwindow=driver.getWindowHandle();
	  
	  System.out.println("Parent window handle : "+parentwindow);
	  
	  driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
	  
	  Set<String> tabs=driver.getWindowHandles();
	  
	  System.out.println("Number of windows: "+tabs.size());
	  
	  for(String childwindow:tabs)
		  
	  {
		  
		  System.out.println(childwindow);
		  
		  if(!childwindow.equalsIgnoreCase(parentwindow))
			  
		  {
			  
			  driver.switchTo().window(childwindow);
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Java')]")).click();
			  
		  }
		  
	  }
	  
	  driver.close();
	  
	  driver.switchTo().window(parentwindow);
	  
	  driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
	  
	  Set<String> windows=driver.getWindowHandles();
	  
	  System.out.println("Number of windows: "+windows.size());
	  
	  for(String childwindow:windows)
		  
	  {
		  
		  System.out.println(childwindow);
		  
		  if(!childwindow.equalsIgnoreCase(parentwindow))
			  
		  {
			  
			  driver.switchTo().window(childwindow);
			  
		  }
		  
	  }
	  
	  driver.quit();
	  
  }
  
}
