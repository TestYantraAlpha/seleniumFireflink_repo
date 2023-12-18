package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("establish DB connection and report config",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close DB connection and flush all reports",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("open browser and navigate to url",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("Close browser",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("logout",true);
	}
	@Test
	public void demoTest() {
		Reporter.log("@Test (Demo test executed...)",true);
	}
	@Test
	public void sampleTest() {
		Reporter.log("@Test (sample test executed...)",true);
	}
	
}
