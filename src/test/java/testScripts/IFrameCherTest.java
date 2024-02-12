package testScripts;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IFrameCherTest
{
  @Test
  public void frameTest()
  {
	  
      WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	  
	  //from main page to frame 1
	  
	  driver.switchTo().frame("frame1");
	  
	  WebElement inputbox=driver.findElement(By.xpath("//input[@type='text']"));
	  
	  inputbox.sendKeys("I am Jayasri");
	  
	  //from frame1 to frame 3
	  
	  driver.switchTo().frame("frame3");
	  
	  WebElement inputbox1=driver.findElement((By.xpath("//input[@id='a']")));
	  
	  inputbox1.click();
	  
	  
      driver.switchTo().parentFrame();
	  
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame("frame2");
      
      
	  Select singleselect=new Select(driver.findElement(By.id("animals")));
	  
	  singleselect.selectByValue("babycat"); 
	  
	  System.out.println(singleselect);
	  
	  WebElement selectedOption = singleselect.getFirstSelectedOption();
	  
      String selectedText = selectedOption.getText();
      
      System.out.println("Selected Option: " + selectedText);
	  
	  
  }
}
