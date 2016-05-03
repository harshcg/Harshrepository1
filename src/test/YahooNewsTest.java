package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

public class YahooNewsTest {
  
  @BeforeTest
  public void xyz() {
	  System.out.println("before executing yahoo news test");
	//  throw new SkipException("skipping the test ");
  }

  @Test
  public void testnews() {
	  System.out.println("executing yahoo news test");
	  
	 // Assert.assertEquals("good", "good");
	  System.out.println("before assertion eror");
	  try
	  {
	  Assert.assertTrue(6>11, "test will fail if condition is false and this message willl displaed in html");
	  }
	  catch(Throwable t)
	  {
		  //Throwable can catch errors as well as exceptions
		  System.out.println("caught the error");
		  // first goes to try if success not goes to catch if error control comes to catch and then
		  // below steps will run.
	  }
	  Assert.assertFalse( 6<1,"test will fail if condition is true and this message willl displaed in html");
	  System.out.println("after assertion eror");
	  //note the above test has failed and assert does not run steps after the failure.
	  
  }
  
}
