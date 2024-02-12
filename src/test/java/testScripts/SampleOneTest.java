package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewConfigurer;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class SampleOneTest
{
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	@BeforeTest
	public void setupExtent()
	{
		extentReports=new ExtentReports();
		spark=new ExtentSparkReporter("test-output/SparkReport.html")
				.viewConfigurer()
				.viewOrder()
				.as(new ViewName[] {
						ViewName.DASHBOARD,
						ViewName.TEST,
						ViewName.AUTHOR,
						ViewName.DEVICE,
						ViewName.LOG
						}).apply();
		extentReports.attachReporter(spark);
	}
	@BeforeMethod
	  public void setup()
	  {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  }
  @Test(retryAnalyzer=RetryAnalyzer.class)
  public void java() 
  {
	  extentTest=extentReports.createTest("Java Search Test");
//	  WebDriver driver=new ChromeDriver();
//	  
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.google.com/");
	  
	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
	  
	  searchbox.sendKeys("Java Tutorial");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  
	  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	  
//	  driver.close();
  }
@Test
  
  public void selenium() 
  {
	extentTest=extentReports.createTest("Selenium Search Test");
//	  WebDriver driver=new ChromeDriver();
//	  
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.google.com/");
	  
	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
	  
	  searchbox.sendKeys("Selenium Tutorial");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  
	  Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
	  
//	  driver.close();
  }
@AfterMethod
public void teardown(ITestResult result)
{
	extentTest.assignAuthor("AutomationTester1")
	.assignCategory("Regression")
	.assignDevice(System.getProperty("os.name"))
	.assignDevice(System.getProperty("os.version"));
	if(ITestResult.FAILURE==result.getStatus())
	{
		extentTest.log(Status.FAIL, result.getThrowable().getMessage());
		String strPath=Utility.getSreenshotPath(driver);
		extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
	}
	else if(ITestResult.SKIP==result.getStatus())
	{
		extentTest.log(Status.SKIP, result.getThrowable().getMessage());
		
	}


	driver.close();
}
@AfterTest
public void finishExtent() 
{
	extentReports.flush();
}
}
