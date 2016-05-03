package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Regtest {
	
	@Test(dataProviderClass=Dataprovider.class,dataProvider="regtestDataProvider")
	public void doRegister(String Username,String Password,String Email)
	{
	}
	
	//so we need to mention the name of the class from which data is coming and the dataprovider name.


	
	

}
