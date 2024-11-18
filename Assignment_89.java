package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to check whether textbox  is enabled or not
public class Assignment_89 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Bhakti/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("username"));
		boolean b1= e1.isDisplayed();
		boolean b2= e1.isEnabled();
		if(b1==true && b2==true)
		{
			e1.sendKeys("bhakti");
		}
		WebElement e2= driver.findElement(By.name("lname"));
		boolean b3= e2.isDisplayed();
		boolean b4= e2.isEnabled();
		System.out.println(b3);
		System.out.println(b4);
			

	}

}
