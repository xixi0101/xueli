package Listener;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;

import com.webtest.core.BaseTest;

public class Massage extends BaseTest {
	@BeforeSuite
	public  void addListener(ITestContext context)throws Exception{
		TestRunner runner = (TestRunner) context;
		
		
	}
	
	

}
