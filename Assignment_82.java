package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to enter username by using the xpath locator 
public class Assignment_82 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Bhakti/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("/html/body/input[1]"));
		e1.sendKeys("Test");

	}

}
