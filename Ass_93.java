package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP on TestNG having @Test  Annotation
public class Ass_93 
{
	@Test
	public void testcase1()
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}


}
