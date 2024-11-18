package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAP to select the dropdowns skills,country and Religion in the Grotechminds registration page
public class Assignment_81 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		//select skills by index
		WebElement e1=	driver.findElement(By.id("Skills"));
		Select s1= new Select(e1);
		s1.selectByIndex(1);
		
		//select country by visible text
		WebElement e2=	driver.findElement(By.id("Country"));
		Select s2= new Select(e2);
		s2.selectByVisibleText("Afganistan ");
		
		//select religion by value
		WebElement e3=	driver.findElement(By.id("Relegion"));
		Select s3= new Select(e3);
		s3.selectByValue("Hindu");	

	}

}
