package grouping;

import org.testng.annotations.Test;

public class SampleTwoTest
{
  @Test(groups="feature1")
  public void testOne() 
  {
	  System.out.println("Test 1");
  }
  @Test(groups="feature1")
  public void testTwo() 
  {
	  System.out.println("Test 2");
  }
  @Test(groups="feature2")
  public void testThree() 
  {
	  System.out.println("Test 3");
  }
  @Test
  public void testFour() 
  {
	  System.out.println("Test 4");
  }
}
