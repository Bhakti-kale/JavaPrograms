package assignments;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//WAP having 1Test, 1 After Suite, 1 Before Method
public class Ass_99 
{
	@AfterSuite
	public void after_suite() {
		System.out.println("AfterSuitefunc");

	}
	
	@Test
	public void the_TC() {
		System.out.println("TestCasefunc");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("BeforeMethodfunc");
	}


	

}
