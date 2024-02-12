package testScripts;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
public class DemoBlaze
{
	  WebDriver driver;
	  
	  @BeforeClass
	  public void logIn() throws IOException, InterruptedException
	  {
		
		
		Properties propcreate=new Properties();
		
		String path=System.getProperty("user.dir")+"//src//test//resources//Propertiesfile//demoblaze.properties";
		
	    FileInputStream inputfile=new FileInputStream(path);
	    
	    propcreate.load(inputfile);
	     
	    driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			 
		driver.get("https://www.demoblaze.com/index.html");
	     
	    WebElement login= driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
	    
	    login.click();
	    
	    String Username = propcreate.getProperty("username");
	    
		System.out.println(Username);
		
	    String password = propcreate.getProperty("password");
//	      Thread.sleep(1000);
	     
	     Thread.sleep(1000);
	     
	     WebElement name=driver.findElement(By.id("loginusername"));
	     
	     name.sendKeys(Username);
	     
	     WebElement pswd1=driver.findElement(By.id("loginpassword"));
	     
	     pswd1.sendKeys(password);
	     
	     WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
	     
		 loginButton.click();
	     
	}

  @Test(dataProvider="itemslist")
  
  public void addToCart(String itemname) throws InterruptedException 
  {
	  
	  driver.navigate().refresh();
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
      WebElement itemLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + itemname + "')]")));
      
      itemLink.click();
      
      Thread.sleep(2000);
      
	  WebElement cart=driver.findElement(By.xpath("//a[text()='Add to cart']"));
	  
	  cart.click();
	  
	  Thread.sleep(3000);
	  
	  Alert alert=driver.switchTo().alert();
	  
	  Assert.assertEquals(alert.getText(), "Product added");
	  
	  alert.accept();
	  
	  driver.navigate().refresh();
	  
      WebElement homebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='navbarExample']//a[text()='Home ']")));
      
      homebutton.click();
	    
	    }
  @	Test
  @DataProvider(name="itemslist")
  
     public Object[] getItems() throws CsvValidationException, IOException
     
  {
	 String path=System.getProperty("user.dir")+"//src//test//resources//testData//items.csv";
	  
	 CSVReader reader=new CSVReader(new FileReader(path));
	 
	 String row[];
	 
	 ArrayList<Object> itemList=new ArrayList<Object>();
	 
	 while((row=reader.readNext())!=null)
	 {
		 String item_name=row[0];
		 
		 itemList.add(item_name);
	 }
	 
	 return itemList.toArray(new Object[itemList.size()]);
  }
@Test

public void displayCart() throws InterruptedException
{
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//a[text()='Cart']")).click();
	
}
  
	  
	  
  
}
