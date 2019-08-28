package POM;

import org.apache.commons.exec.DaemonExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

import TestBase.TestBase;
import Utilities.ExcelUtilities;

public class RegistrationPage extends TestBase   {
  
	
	@FindBy(xpath="//*[@id='customer.firstName']")
	public static WebElement FirstName;
	
	@FindBy(xpath="//*[@id='customer.lastName']")
	public static WebElement LastName;
	
	@FindBy(xpath="//*[@id='customer.address.street']")
	public static WebElement Address;
	
	@FindBy(xpath="//*[@id='customer.address.city']")
	public static WebElement City;
	
	@FindBy(xpath="//*[@id='customer.address.state']")
	public static WebElement State;
	
	@FindBy(xpath="//*[@id='customer.address.zipCode']")
	public static WebElement Zip;
	
	@FindBy(xpath="//*[@id='customer.phoneNumber']")
	public static WebElement Phone;
	
	@FindBy(xpath="//*[@id='customer.ssn']")
	public static WebElement SSN;
	
	@FindBy(xpath="//*[@id='customer.username']")
	public static WebElement Username;
	
	@FindBy(xpath="//*[@id='customer.password']")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id='repeatedPassword']")
	public static WebElement Confirm;
	
	
	
	
	public RegistrationPage()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public static void register() throws InterruptedException, FilloException
	{
		ExcelUtilities eu=new ExcelUtilities();
		FirstName.sendKeys(eu.getData("FirstName","TC_01"));
		LastName.sendKeys(eu.getData("LastName","TC_01"));
	    Address.sendKeys(eu.getData("Address","TC_01"));
		City.sendKeys(eu.getData("City","TC_01"));
		State.sendKeys(eu.getData("State","TC_01"));
		Zip.sendKeys(eu.getData("ZipCode","TC_01"));
		Phone.sendKeys(eu.getData("Phone","TC_01"));
		SSN.sendKeys(eu.getData("SSN","TC_01"));
		Username.sendKeys(eu.getData("Username","TC_01"));
		Password.sendKeys(eu.getData("Password","TC_01"));
		Confirm.sendKeys(eu.getData("Password","TC_01"));
		Confirm.submit();
		Thread.sleep(9000);
	}
}

