package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckRadioButton
{
  @Test
  
  public void checkButton() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	  
	  WebElement age=driver.findElement(By.id("isAgeSelected"));
	  
	  if(!age.isSelected())
		  
	  {
		  
		  age.click();
		  
	  }
	  
	  driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
	  
	  //Radio Button
	  
	  Thread.sleep(2000);
	  
	  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	  
	  driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
	  
  }
  
}
