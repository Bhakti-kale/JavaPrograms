package assignments;

import org.testng.annotations.Test;

//WAP on TestNG using different priority on  3 @Test  Annotation and check the order of execution
public class Ass_94 
{
	@Test(priority=2)
	public void login() {

	}

	@Test(priority=3)
	public void logout() {

	}

	@Test(priority=1)
	public void registration() {

	}

	
}
