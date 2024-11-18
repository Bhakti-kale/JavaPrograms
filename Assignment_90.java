package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch naukri url https://www.naukri.com/registration/createAccount?othersrcp=22636,click on continue with Google,
//check whether two ids are coming and 
//move the control from parent to child
public class Assignment_90 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//span[@class='google-text']"));
		e1.click();
		System.out.println(driver.getWindowHandles());
		Set <String> s1=	driver.getWindowHandles();
		Iterator <String> i1=	s1.iterator();
		String parentid=	i1.next();
		String childid= 	i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		driver.findElement(By.id("identifierId")).sendKeys("bhakti");
		Thread.sleep(2000);
		driver.close();


	}

}
