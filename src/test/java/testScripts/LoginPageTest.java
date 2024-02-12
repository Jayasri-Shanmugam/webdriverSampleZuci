package testScripts;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginPageTest 
{
  @Test
  public void validLogin() 
  {
	  ChromeOptions options=new ChromeOptions();
		
		options.setBrowserVersion("115");
		
		
		WebDriver driver=new ChromeDriver(options);//launching chrome

		
		driver.get("https://the-internet.herokuapp.com/login");//launching google

		driver.manage().window().maximize();

		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("tomsmith");
		
		WebElement pswrd=driver.findElement(By.id("password"));
		pswrd.sendKeys("SuperSecretPassword!");
		
		WebElement login=driver.findElement(By.className("radius"));
		login.click();
		
		//login=driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.partialLinkText("Elemental")).click();
		//driver.findElement(By.linkText("Elemental Selenium")).click();
  }
}

