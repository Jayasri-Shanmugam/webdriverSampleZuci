package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTwoTest {
	WebDriver driver;
	  @Test
	  public void testone() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample2-1:"+id);
	  }
	  @Test
	  public void testtwo() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample2-2:"+id);
	  }
	  @Test
	  public void testthree() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample2-3:"+id);
	  }
	  @Test
	  public void testfour() 
	  {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Sample2-4:"+id);
	  }

}
