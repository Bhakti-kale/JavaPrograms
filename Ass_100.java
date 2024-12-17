package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//WAP having 1 After Suite, 1 Before Suite, 1 After Method and check the order of execution
public class Ass_100 
{
	@AfterSuite
	public void afters() {
		System.out.println("aftersA");
	}
	
	@BeforeSuite
	public void beforesuites() {
		System.out.println("BeforesuitesA");
	}
	
	@Test
	public void test_s() {
		System.out.println("tests");
	}
	
	@AfterMethod
	public void aftermethods() {
		System.out.println("aftermethodA");
	}

	
}
