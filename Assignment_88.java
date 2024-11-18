package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to handle the autosuggestion for google search, Flipkart and Amazon Site.
public class Assignment_88 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(3000);
		List <WebElement>  e2=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int Length= e2.size();
		System.out.println(Length);		//count of autosuggestion
		//e2.get(1).click();
		e2.get(Length-10).click();		// clink on any autosuggetion
		for(int i=0; i<Length; i++)		// printing all autosuggestion
		{
		WebElement a1=	e2.get(i);
		String Autosuggetion=	a1.getText();
		System.out.println(Autosuggetion);
		
		//Flipcart
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("MOBILE");
		Thread.sleep(2000);
		List<WebElement>s1=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		Thread.sleep(2000);
		int length=s1.size();
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			WebElement s2=s1.get(i);
			String s3=s2.getText();
			System.out.println(s3);
			
		}

		s1.get(2).click();
*/

		//Amazon
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement>	e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		e2.get(e2.size()-1).click();
		
*/

	}

	}
}
