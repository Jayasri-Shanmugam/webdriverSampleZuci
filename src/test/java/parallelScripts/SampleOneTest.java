package parallelScripts;

//import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleOneTest
{
	WebDriver driver;
  @Test
  public void test1() 
  {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Sample1-1:"+id);
  }
  @Test
  public void test2() 
  {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Sample1-2:"+id);
  }
  @Test
  public void test3() 
  {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Sample1-3:"+id);
  }
  @Test
  public void test4() 
  {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Sample1-4:"+id);
  }

}
