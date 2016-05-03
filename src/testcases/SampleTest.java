package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=1)
	public void Testlogin()
	{   Assert.assertEquals("A", "B");
		System.out.println("Login test");
	}
	
	
	@Test(priority=2,dependsOnMethods={"Testlogin"})
	public void Testchangepassword()
	{
		System.out.println("Password change test");
	}
	
	@Test(priority=3,dependsOnMethods={"Testlogin","Testchangepassword"})
	public void logout()
	{
		System.out.println("logout test");
	}
	
	//the order of o/p is different if we run normally.for that we use priority.
	//for Assert- we use other 2 tests were run but they should not as login was failed.
	//to avoid above we use dependson as test login failed the othere 2 tests were skpped.
	
	
}
