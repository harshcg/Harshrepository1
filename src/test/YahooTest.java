// for using it go to src of module 9 right click go to new other testng class and then give the name ofpackage
// as test ,class as yaootest and select annotaions
//then expand src folder where u get test package with newtest.java as a class.
package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
  @BeforeSuite//once before executing all tests in all java files
  
   public void initializeselenium() 
  {
    System.out.println("in the very beginning -initialize slenium");
  }
  
  @AfterSuite//once after executing all tests in all java files(test casesindide 1 suite)
  
   public void shutdownselenium() 
  {
    System.out.println("in the very end -destroy slenium");
  }
  
  @Test
  public void testReceiveMail() {
	  System.out.println("testing receiving mail");
  }
  
  @Test
  public void testSendMail() {
	  
	  System.out.println("testing sending mail");
  }
  
  @BeforeMethod
  //before executing every test cases
  public void openbrowser() {
	  System.out.println("opening of browser");
  }
  
  @AfterMethod
  //after  executing every test cases 
  public void cloasebrowwser() {
	  System.out.println("closing  of browser");
  }


  @BeforeTest
  public void connetdb() {
	  System.out.println("connectting to db");
	  //before executing all test cases and runs only once.
  }
  
  @AfterTest
  public void closedb() {
	  System.out.println("closing to db");
	//after  executing all test cases and runs only once.
  }

  
  /*
   * o/p
  connectting to db-beforetest runs 1st and only once
  opening of browser
  testing receiving mail
  closing  of browser
  opening of browser
  testing sending mail
  closing  of browser
  closing to db"
  */

}
