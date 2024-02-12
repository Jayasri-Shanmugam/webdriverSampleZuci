package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class GooglePageTest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		
		options.setBrowserVersion("115");
		
		
		WebDriver driver=new ChromeDriver(options);//launching chrome
//		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.google.com/");//launching google
		WebElement searchbox=driver.findElement(By.id("APjFqb"));//search box id
		
		searchbox.sendKeys("Java Tutorial");//content to search
		searchbox.sendKeys(Keys.ENTER);//enter key

	}

}
