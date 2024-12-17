package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//WAP having 2 Test, 1 After Method, 1 Before Method check the order of execution
public class Ass_102 
{
	@Test()
	public void testOnes() {
		System.out.println("TestOne");
	}

	@Test()
	public void testTwos() {
		System.out.println("TestTwo");
	}

	@AfterMethod
	public void testAfters() {
		System.out.println("AfterMethod");
	}

	@BeforeMethod
	public void testAfterss() {
		System.out.println("BeforeMethod");
	}

	

}
