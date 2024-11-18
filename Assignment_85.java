package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to Right Click on any component in Flipkart Website
public class Assignment_85 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement  e1=driver.findElement(By.xpath("//a[@title='Become a Seller']"));
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();


	}

}
