package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass_111 
{
	@DataProvider(name="Search")
	public Object[][] method1() {
		Object data[][] = new Object[10][1];
		data[0][0] = "Shoe";
		data[1][0] = "Mobile";
		data[2][0] = "Pune";
		data[3][0] = "Laptop";
		data[4][0] = "Selenium";
		data[5][0] = "testng";
		data[6][0] = "Java";
		data[7][0] = "Bag";
		data[8][0] = "Jwellary";
		data[9][0] = "bike";
		
		return data;
	}
	
	@Test(dataProvider="Search")
	public void amazonsearch(String SearchValue)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(SearchValue);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
