package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;



public class LoginPage {
	
	
	
	
    WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By username=By.name("email1");
	
	private By password=By.name("password1");
	
	private By loginButton=By.xpath("//button[normalize-space()='Sign in']");
	
	private By manageOption=By.xpath("//span[normalize-space()='Manage']");
	
	public void loginToApplication(String uname,String pass)
	{
		//driver.findElement(username).sendKeys(uname);
		Utility.waitForWebElement(driver, username).sendKeys(uname);
		
		Utility.waitForWebElement(driver, password).sendKeys(pass);
		
		//driver.findElement(password).sendKeys(pass);
		
		//driver.findElement(loginButton).click();
		
		Utility.waitForWebElement(driver, loginButton).click();
		
	}
	
	public boolean isUserLoggedIn()
	{
		boolean status=false;
		
		try
		{
			//driver.findElement(manageOption).isDisplayed();
			Utility.waitForWebElement(driver, manageOption).isDisplayed();
			status=true;
		}
		catch(NoSuchElementException e)
		{
			
		}
		return status;
		
	}
	
	
	//my code:
	private By addtocart=By.xpath("//div[4]//div[2]//button[1]");	
	
	private By cartbtn=By.xpath("//button[@class='cartBtn']");
	
	
	private By enrollnowbtn=By.xpath("//button[text()='Enroll Now']");
	
	private By address=By.id("address");
	
	//private By phonenumber=By.xpath("//h3[text()='Phone Number']");
	
	
	private By phonenumber=By.id("phone");
	
	private By EnrollNowbtn=By.xpath("//button[@class='action-btn']");
	
	
	private By innertext=By.xpath("//h4[normalize-space(text()='Your order id is')]");
	
	private By cancelbtn=By.xpath("//button[text()='Cancel']");
	

	public void cartclk()
	{
		
		Utility.waitForWebElement(driver, addtocart).click();
		Utility.waitForWebElement(driver, cartbtn).click();	
		
		
	}
	
	public void enrollnow()
	{
		
		Utility.waitForWebElement(driver, enrollnowbtn).click();
		Utility.waitForWebElement(driver, address).sendKeys("BTM");		
		//Utility.waitForWebElement(driver, phonenumber).sendKeys("9089005678");
		Utility.waitForWebElement(driver, phonenumber).sendKeys(String.valueOf("9089005678"));
		Utility.waitForWebElement(driver, EnrollNowbtn).click();
		String text=Utility.waitForWebElement(driver, innertext).getText();
		System.out.println(text);
		Utility.waitForWebElement(driver, cancelbtn).click();	
		
		
	}
		
	

}
