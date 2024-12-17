package assignments;

import org.testng.annotations.Test;

//WAP to disable a test in TestNG
public class Ass_95 
{
	@Test(enabled=false,priority=1)			//to disable the test case @Test(enabled=false)
	public void login() 
	{

	}

	@Test(priority=2)
	public void logout() 
	{

	}



}
