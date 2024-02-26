package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	
	//@DataProvider(name="UserData")
	@DataProvider(name="userData")
	public static Object[][] getUserData()
	{
		Object arr[][]=ExcelReader.getData("Users");
		
		return arr;
	}

}
