package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleThreeTest {
	WebDriver driver;
	  @Test
	  public void testOne() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample3-1:"+id);
	  }
	  @Test
	  public void testTwo() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample3-2:"+id);
	  }
	  @Test
	  public void testThree() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample3-3:"+id);
	  }
	  @Test
	  public void testFour() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample3-4:"+id);
	  }

}
