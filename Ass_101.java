package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//WAP having 2 Test, 1 After Method and check the order of execution
public class Ass_101 
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

	
}
