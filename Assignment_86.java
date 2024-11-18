package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Automate JSAM Application by wring only absolute xpath
public class Assignment_86 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bhakti/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Bhakti");
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		WebElement e1=driver.findElement(By.xpath("/html/body/select"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Christian");

	}

}
