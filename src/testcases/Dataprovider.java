package testcases;

import org.testng.annotations.DataProvider;

public class Dataprovider {

	
	@DataProvider(name="regtestDataProvider")
	public static Object[][] getData(){
		
		// Selenium framework - read the data from xls file and put it in Object array
		// rows - number of time test has to be repeated
		// cols - number of parameters in test data
		Object[][] data = new Object[2][3];
		// 1st row
		data[0][0] = "UI";
		data[0][1] = "P1";
		data[0][2]  = "XYZ@GMAIL.COM";
		
		// 2nd row 
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2]  = "ABC@GMAIL.COM";
		
		return data;		
	}
}
