import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {

	public static void main(String args[])
	{
		XmlSuite suite=new XmlSuite();
		suite.setName("Suite2");
		
		XmlTest test=new XmlTest();
		test.setName("Parabank Test");
		
		List<XmlClass> classses=new ArrayList();
		
		classses.add(new XmlClass("TestCases.TC_01"));		
		classses.add(new XmlClass("TestCases.TC_02"));
		test.setXmlClasses(classses);
		
		
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		
		
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
		
	}
}
