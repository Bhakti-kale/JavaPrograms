package assignments;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//WAP having 2 Test, 1 After Suite, 1 Before Suite and check the order of execution
public class Ass_98 
{
	@AfterSuite
	public void after_suite() {
		System.out.println("AfterSuitefunc");

	}
	
	@Test
	public void TC() {
		System.out.println("TestCase");
	}
	@Test
	public void TC1() {
		System.out.println("TestCase2");
	}
	
	@BeforeSuite
	public void before_method() {
		System.out.println("BeforeMethodfunc");
	}


	
}
