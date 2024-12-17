package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//WAP having 1 Test, 1 After Method , 1 Before Method and check the order of execution
public class Ass_104 
{
	@Test()
	public void testone() {
		System.out.println("TestOne");
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
