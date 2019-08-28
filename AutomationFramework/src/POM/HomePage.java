package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.codoid.products.exception.FilloException;

import TestBase.TestBase;
import Utilities.ExcelUtilities;

public class HomePage extends TestBase  {

	
	@FindBy(xpath=".//*[text()='Register']")
	public static WebElement Register;
	
	@FindBy(xpath="//*[@name='username']")
	public static WebElement username;
	

	@FindBy(xpath="//*[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath="//h1[text()='Accounts Overview']")
	public static WebElement LoginTitle;
	
	
	public HomePage()
	{
		
		PageFactory.initElements(driver,this);
	}
	public static void clickonRegisterlink() 
	{
		
	    Register.click();
	    
	}

	public static void login() throws InterruptedException, FilloException 
	{
		ExcelUtilities eu=new ExcelUtilities();
		System.out.printf(eu.commondata("Password"));
	    username.sendKeys(eu.commondata("Username"));
	    password.sendKeys(eu.commondata("Password"));
	    username.submit();
	    WebDriverWait wait=new WebDriverWait(driver,40);
	    wait.until(ExpectedConditions.visibilityOf(LoginTitle));
	    
        String Title=LoginTitle.getText();
        Assert.assertEquals(Title, "Accounts Overview");
        
	}
		
			
}
