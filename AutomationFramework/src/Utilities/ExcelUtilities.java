package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import TestBase.TestBase;

public class ExcelUtilities extends TestBase {

	public static Fillo fill;
	public static Connection con;
	
	
	public ExcelUtilities() throws FilloException
	{
		 fill=new Fillo();
		con=fill.getConnection("//Users//karanprinja//Documents//TestData.xls");	
	}
	 
	public String commondata(String Value) throws FilloException
	{
		String query="Select * from Common where Data='TestData'";
		Recordset recordset=con.executeQuery(query);
        String valtoreturn = null;
	  while(recordset.next())
	  {
		  valtoreturn=recordset.getField(Value);
		
	  }
	return valtoreturn;
	}
	
	
    public String getData(String Value,String TestCase) throws FilloException
	{
		

		String query="Select * from Datasheet where TestCase='"+TestCase+"'";
		Recordset recordset=con.executeQuery(query);
		
        String valtoreturn = null;
	  while(recordset.next())
	  {
		  valtoreturn=recordset.getField(Value);
		
	  }
		
		return valtoreturn;
	}






}

