package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import POM.HomePage;
import POM.RegistrationPage;
import TestBase.TestBase;
import Utilities.ExcelUtilities;

public class TC_02 {

	public static HomePage hp;
	public static RegistrationPage register;
	
	@BeforeClass
	public void start() throws FilloException
	{
		TestBase.initialise();
	}
	
	@Test
	public void Login() throws InterruptedException, FilloException
	{
		
		hp=new HomePage();
		hp.login();
	}
	
	@AfterClass
	public void tearDown()
	{
		TestBase.quit();
	}
}
