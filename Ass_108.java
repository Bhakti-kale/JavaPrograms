package assignments;
//WAP using TestNG annotation for  search in google with multiple data sets using dataprovider annotation
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass_108 
{
	@DataProvider(name="data1")
	public Object [][] method1()
	{
		return new Object [][] {{"Modi"},{"Air Pollution"},{"Pune"},{"SRK"},{"Salman khan"}};
	}
	@DataProvider(name="data2")
	public Object [][] method2()
	{
		return new Object [][] {{"11"},{"121"},{"546"},{"789"},{"474"}};
	}
	
	@Test(dataProvider="data1")
	public void googlesearch(String input)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
