//package testScripts;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;

//public class GoogleSearchTest
//{
//  @Test
  
//  public void searchJavaTest() throws InterruptedException 
//  {
////	  ChromeOptions options=new ChromeOptions();
//		
////		options.setBrowserVersion("115");
//		
//		
//		WebDriver driver=new ChromeDriver();//launching chrome
//
//		
//		driver.get("https://www.google.com/");//launching google
//		//driver.navigate().to("https://www.google.com/");
//		
//		WebElement searchbox=driver.findElement(By.id("APjFqb"));//search box id
//		
//		searchbox.sendKeys("Java Tutorial");//content to search
//		
////		Thread.sleep(1000);
//		
////		List<WebElement> items=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descent::div[@class='InVSe']"));
//		
////		System.out.println("No of items: "+items.size());
//		
////		for(WebElement item:items)
//		{
////			System.out.println(item.getText());
//			
////			if(item.getText().equalsIgnoreCase("java tutorial pdf"))
//////			{
////				item.click();
////				break;
////			}
////		}
//		
//		
//		
//		searchbox.sendKeys(Keys.ENTER);//enter key
//		
//		System.out.println("Moving to front page");
//		driver.navigate().back();
//		
//		System.out.println("Moving to next page");
//		driver.navigate().forward();
//		
//		System.out.println("Refreshing the page");
//		driver.navigate().refresh();
//		
//		System.out.println("TITLE: "+driver.getTitle());
//		
//		
//		System.out.println("CURRENT URL: "+driver.getCurrentUrl());
//		
//		
//		System.out.println("PAGE SOURCE: "+driver.getPageSource());
//		
//  }
//  
//}
//
