package testScripts;



import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class ParabankTest {
	WebDriver driver;
	@BeforeClass
	  public void setup()
	  {
	 driver=new ChromeDriver();
	  
	 driver.manage().window().maximize();
	  
	 driver.get("https://parabank.parasoft.com/parabank/index.html");
	  }
	
  @Test(priority=1)
  public void loginPage() throws InterruptedException 
  {
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  
	 username.sendKeys("aaaa");
	 
	 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	  
	 password.sendKeys("aaaa");
	  
	 WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
	 
	 loginButton.click();
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 Assert.assertEquals(driver.getTitle(),"ParaBank | Accounts Overview" );
  }
  @Test(priority=2)
  public void openNewAccount()throws InterruptedException
  {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  WebElement openNewAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Open New Account']")));
	  
	  openNewAcc.click();
	  
	 driver.findElement(By.xpath("//option[contains(text(),'CHECKING')]")).click();
	       
	 driver.findElement(By.xpath("//option[contains(text(),'13788')]")).click();
//	  
	 Thread.sleep(1000);
	  
	 driver.findElement(By.xpath("//input[@type='submit' and @class='button']")).click();
	 
	 boolean val=driver.findElement(By.xpath("//h1")).isDisplayed();
	 
	 Assert.assertTrue(val);
  }
  @Test(priority=3)
  public void transferFunds() throws InterruptedException
  {
	  
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
	  
//	 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
//	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='amount']"))).sendKeys("400");
     
     
	 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1600");
	 
	 Select fromaccount=new Select(driver.findElement(By.id("fromAccountId")));
	 
	 fromaccount.selectByValue("15009");
	  
	 Select toaccount=new Select(driver.findElement(By.id("toAccountId")));
	  
	 toaccount.selectByValue("15342");
	  
	 driver.findElement(By.xpath("//input[@type='submit' and @value='Transfer']")).click();
	 
	 Thread.sleep(1000);
	 
	 boolean value1=driver.findElement(By.xpath("//h1")).isDisplayed();
	 
	 Assert.assertTrue(value1);
	//a[contains(text(),'Accounts Overview')]
//	 Thread.sleep(1000);
  }
  @Test(priority=4)
//  @Test(priority=4)
  public void accountOverview() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
	 Thread.sleep(1000);
	 boolean check=driver.findElement(By.xpath("//a[contains(text(),'15342')]")).isDisplayed();
	 Assert.assertTrue(check);
 }
  
}
 
