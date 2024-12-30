package assignments.Ass_112;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_54 
{
	@Test(retryAnalyzer=retryFailedTC.Retrylogic_54.class)	//packagename.classname.class
	public void googlesearch() throws InterruptedException
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//WebElement e1=driver.findElement(By.name("q")); //correct xpath
	WebElement e1=driver.findElement(By.name("qq")); //purposly given wrong xpsath to fsil tc
	e1.sendKeys("Bangalore"+Keys.ENTER);
	}
}

