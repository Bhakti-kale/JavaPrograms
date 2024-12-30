package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//WAP using TestNG Assertions to validate the "User registered successfully" alert message on the GroTechMinds demo registration form
public class Ass_115 
{
	@Test
	public void regis() throws InterruptedException
	{
		String text="C:\\\\Users\\\\Bhakti\\\\file.docx";

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Bhakti");
		driver.findElement(By.id("lname")).sendKeys("Kale");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Abc@2");
		driver.findElement(By.id("male")).click();
		WebElement e1=driver.findElement(By.id("Skills"));

		Select s1=new Select(e1);
		Thread.sleep(2000);
		s1.selectByVisibleText("Technical skills");
		WebElement e2=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[8]"));
		Thread.sleep(2000);
		Select s2=new Select(e2);
		s2.selectByValue("Python");
		WebElement e3=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[9]"));
		Thread.sleep(2000);
		Select s3=new Select(e3);
		s3.selectByIndex(0);
		driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[10]")).sendKeys("Bhaktiakle");
		driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[11]")).sendKeys("Bhaktiakle");
		driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[12]")).sendKeys("123456");
		WebElement e4=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[13]"));
		Thread.sleep(2000);
		Select s4=new Select(e4);
		s4.selectByIndex(0);
		
		WebElement file = driver.findElement(By.id("file"));
	Thread.sleep(2000);
		file.sendKeys(text);
		WebElement relocate = driver.findElement(By.id("relocate"));

		relocate.click();
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(2000);
		
		
	}

}
