package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider;
import pages.LoginPage;

public class LoginTest extends BaseClass{
  
	  
	  
	    @Test(dataProvider = "userData",dataProviderClass = CustomDataProvider.class)
		public void loginWithValidCredentials(String uname,String pass)
		{
			LoginPage login=new LoginPage(driver);
			
			login.loginToApplication(uname,pass);
			
			Assert.assertTrue(login.isUserLoggedIn(),"Login failed");
			
			
			//my code:			
			login.cartclk();
			
			
			login.enrollnow();
			
		
			//driver quitting		
			//driver quitting		
			
			
		}
	    
	    
	    
	   
	    
  }

	