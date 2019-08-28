package TestBase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;

import Utilities.ExcelUtilities;

public class TestBase {

	public static WebDriver driver;
	
	public static void initialise() throws FilloException
	{
		ExcelUtilities eu=new ExcelUtilities();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(eu.commondata("URL"));
		
	}
	
	public static void quit()
	{
		driver.quit();
	}
}
