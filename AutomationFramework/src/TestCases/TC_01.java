package TestCases;

import org.testng.annotations.*;

import com.codoid.products.exception.FilloException;

import POM.HomePage;
import POM.RegistrationPage;
import TestBase.TestBase;
@Listeners(Listener.Listen.class)
public class TC_01 {
public static HomePage hp;
public static RegistrationPage register;

@BeforeClass
public void start() throws FilloException
{
	TestBase.initialise();
}

@Test
public void Registration() throws InterruptedException, FilloException
{
	hp=new HomePage();
	register=new RegistrationPage();
	HomePage.clickonRegisterlink();
	RegistrationPage.register();
	
}

	
@AfterClass
public void tearDown()
{
	TestBase.quit();
}
	
	
}
