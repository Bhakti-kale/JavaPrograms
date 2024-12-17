package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP using timeOut parameter in TestNG
public class Ass_96 
{
	@Test(timeOut=1000)
	public void testcase4() 
	{
		ChromeDriver driver=new ChromeDriver();		//ThreadTimeoutException

	}
	

	

}
