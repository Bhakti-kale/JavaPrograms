package assignments.Ass_116;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listner_logic_56.class)				//remember this is outside the class 
public class TestCsse1 extends Listner_logic_56
{
	//ChromeDriver driver; we need to keep in parent class so that it will access
	@Test
	public void googlesearch()
	{
	 driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		//to pass tc
	//driver.findElement(By.name("qp")).sendKeys(Keys.ENTER);	//to fail test case
	
	
}
}
