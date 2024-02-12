package grouping;

import org.testng.annotations.Test;

public class SampleThreeTest
{
	@Test
	  public void testOne() 
	  {
		  System.out.println("Test one");
	  }
	  @Test
	  public void testTwo() 
	  {
		  System.out.println("Test two");
	  }
	  @Test(groups="feature2")
	  public void testThree() 
	  {
		  System.out.println("Test three");
	  }
	  @Test(groups="feature3")
	  public void testFour() 
	  {
		  System.out.println("Test four");
	  }
}
