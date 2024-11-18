package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to Hoverover on flipkart > Fashion > Men Footwear > Men's Sports Shoe
public class Assignment_83 {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//span[.='Fashion'][1]"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e2= driver.findElement(By.xpath("//a[.='Men Footwear']")); //(//object/a)[4]
		
		a1.moveToElement(e2).perform();
		Thread.sleep(2000);
		WebElement e3= driver.findElement(By.linkText("Men's Sports Shoes"));
		e3.click();

	}

}
