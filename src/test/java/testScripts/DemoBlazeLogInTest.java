package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlazeLogInTest
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
  
	@Test(priority=1)
	  public void incorrectUserName() throws InterruptedException
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		  username.sendKeys("Mickymouse");
		  WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		  password.sendKeys("Jai@28");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "User does not exist.");
		  alert.accept();
		
		  
	  }
	@Test(priority=2)
	  public void incorrectPassword() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		  username.sendKeys("MickyMouse");
		  WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		  password.sendKeys("Jai28");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "Wrong password.");
		  alert.accept();
	}
	@Test(priority=3)
	public void incorrectUsername_incorrectPassword()
	{
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		  username.sendKeys("Mickymouse");
		  WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		  password.sendKeys("Jai28");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "User does not exist.");
		  alert.accept();
	}
	
	
	@Test(priority=4)
	  
	  public void blankPassword() throws InterruptedException
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		  username.sendKeys("MickyMouse");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
		  alert.accept();
		 }
	@Test(priority=5)
	  public void blankUsername() throws InterruptedException
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginpassword']")));
		  password.sendKeys("Jai@28");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
		  alert.accept();
		 }
	@Test(priority=6)
	  public void blankUsername_blankpassword() throws InterruptedException
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		  username.sendKeys("");
		  WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		  password.sendKeys("");
		  WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		  loginButton.click();
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert=driver.switchTo().alert();
		  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
		  alert.accept();
		 }
	
	  
	  @AfterMethod
	  public void terminate()
	  {
		  driver.close();
	  }
	  
	  

}
