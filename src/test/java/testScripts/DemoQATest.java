package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoQATest
{
  @Test
  
  public void testPage() throws InterruptedException
  {
      WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/automation-practice-form");
	  
	  driver.findElement(By.id("firstName")).sendKeys("Jayasri");
	  
	  driver.findElement(By.id("lastName")).sendKeys("Shanmugam");
	    
      driver.findElement(By.id("userEmail")).sendKeys("happymeshri@gmail.com");
      
      Thread.sleep(1000);
	    
	  WebElement radiobutton=driver.findElement(By.xpath("//label[text()='Female']"));
	  
	  radiobutton.click();
	  
	  WebElement mobilenumber=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
	  
	  mobilenumber.sendKeys("9786763777");
	  
//	  driver.findElement(By.xpath("document.getElementById('dateOfBirthInput').value='05 Mar 2024'"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  WebElement date=(WebElement)js.executeScript("return document.getElementById('dateOfBirthInput').value='05 Mar 2024'");

	  
//	  WebElement textArea=driver.findElement(By.cssSelector(".css-1g6gooi"));
//	  
//	  textArea.sendKeys("Hindi");
//	  
	  	 WebElement textArea = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		 textArea.sendKeys("en");
		 driver.findElement(By.id("react-select-2-option-0")).click();
//	  WebElement sports=driver.findElement(By.xpath("//label[text()='Sports']"));
//	  
//	  sports.click();
//	  
//	  WebElement reading=driver.findElement(By.xpath("//label[text()='Reading']"));
//	  
//	  reading.click();
//	  
//       WebElement addfile=driver.findElement(By.id("uploadPicture"));
//	  
//	  String strPath=System.getProperty("user.dir")+"//1706687174501.png";
//	  
//	  addfile.sendKeys(strPath);
//	  
//	  WebElement address=driver.findElement(By.id("currentAddress"));
//	  
//	  address.sendKeys("Somampatty");
//	  
//	  Select state=new Select(driver.findElement(By.cssSelector(".css-19bqh2r")));
//	  
//	  state.selectByVisibleText("Haryana");
//	  
//	  Select citySelect=new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div/svg")));
//	  
//	  citySelect.selectByVisibleText("Panipat");
//	  
//	  driver.findElement(By.id("submit")).click();
  }
  
}
