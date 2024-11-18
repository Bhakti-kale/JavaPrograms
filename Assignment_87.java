package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to drag and drop and revert it back to the original position
public class Assignment_87 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();

		WebElement e1=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);

		a1.dragAndDrop(e1,e2).perform();
        Thread.sleep(3000);
		a1.dragAndDrop(e2,e1).perform();

	}

}
