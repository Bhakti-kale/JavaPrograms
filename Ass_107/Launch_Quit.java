package assignments.Ass_107;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit 
{
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")		
	//in xml we have given value to this parameter browser, whatever value it will take, it will give it to ur method.
	//whenever any parameter giving input to the method it will always gibe in form of parameterise concept
	public void Launch(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{		
		//System.out.println("Launching browser");
	   driver= new ChromeDriver();
	  // driver.get("https://www.amazon.in/");
   	  // driver.manage().window().maximize();
		}
		if(nameofbrowser.equals("edge"))
		{		
		
	    driver= new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{		
		
	    driver= new FirefoxDriver();
		}
	}
	@AfterMethod
	public void Quit()
	{
		System.out.println("closing browser");
		driver.close();

}
}
