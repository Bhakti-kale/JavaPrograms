package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to check whether textbox  is displayed or not
public class Ass_91 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.id("fname"));
		boolean isDisplay=textbox.isDisplayed();
		
		if(isDisplay) {
			System.out.println("Checkbox is displayed");
		}
		else {
			System.out.println("Checkbox not displayed");
		}

	}

}
