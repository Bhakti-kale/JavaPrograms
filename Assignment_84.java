package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to Double Click on any component in Flipkart Website
public class Assignment_84 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();

	}

}
