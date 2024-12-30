package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass_110 
{
		@DataProvider(name = "LoginCredentials")
		public Object[][] method1() {
			Object data[][] = new Object[6][2];
			// 1st row-1st test case
			data[0][0] = "bk@gmail.com";// valid UN
			data[0][1] = "bk123";// valid pWD

			// 2nd row-2nd test case
			data[1][0] = "bk@gmail.com";// valid UN
			data[1][1] = "bk12";// Invalid pWD

			// 3rd row-3rd test case
			data[2][0] = "b@gmail.com";//IN valid UN
			data[2][1] = "bk123@";// INvalid pWD
			
			// 4th row-4th test case
			data[3][0] = "b@gmail.com";// Invalid UN
			data[3][1] = "bk";// Invalid pWD
			
			// 5th row-5th test case
					data[4][0] = "";// null
					data[4][1] = "";// null
					
					// 6th row-6th test case
					data[5][0] = "bk@gmail.com";// valid UN
					data[5][1] = "";// null		
			
			return data;
			
		}
	@Test(dataProvider="LoginCredentials")
	public void loginamazon(String Email, String Password)
	{
		ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Flog-in%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("ap_email"));
		e1.sendKeys(Email);
		
		WebElement e2=	driver.findElement(By.id("continue"));
		e2.click();
		
		WebElement e3= driver.findElement(By.name("password"));
		e3.sendKeys(Password);
		
		WebElement e4= driver.findElement(By.id("signInSubmit"));
		e4.click();
	}

}
