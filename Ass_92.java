package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to check whether element is selected or not
public class Ass_92 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement radiobutton=driver.findElement(By.id("male"));
		
		if(radiobutton.isSelected()) {
			System.out.println("button is selected");
		}else {
			System.out.println("button not selected");
		}

	}

}
