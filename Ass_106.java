package assignments;
//WAP using TestNG annotations to launch browser ,add product to cart and log out use> 
//BeforeMethod , Test , After Method.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_106 
{
		WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Flog-in%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void Quite()
	{
		driver.close();	
	}
	
	@Test
	public void searchProduct() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		WebElement cart = driver.findElement(By.id("a-autoid-1-announce"));
		cart.click();
	}
	

}
