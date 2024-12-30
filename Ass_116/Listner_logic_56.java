package assignments.Ass_116;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_logic_56 implements ITestListener
{
	static ChromeDriver driver;  
	//why made global var static--

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TestCase is passed");
		TakesScreenshot t1 =   driver;
		File Source = t1.getScreenshotAs(OutputType.FILE);
		// File destination=new File("C:\\Users\\Bhakti\\eclipse-workspace\\SeleniumProj\\Screenshot\\bhakti.png");
		//Way to give unique filename
		File destination = new File("C:\\Users\\Bhakti\\eclipse-workspace\\SeleniumProj\\Screenshot\\pass\\photo" + Math.random() + ".png");
		try {
			FileHandler.copy(Source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("TestCase is failed");
		TakesScreenshot t1 =   driver;
		File Source = t1.getScreenshotAs(OutputType.FILE);
		// File destination=new File("C:\\Users\\Bhakti\\eclipse-workspace\\SeleniumProj\\Screenshot\\bhakti.png");
		//Way to give unique filename
		File destination = new File("C:\\Users\\Bhakti\\eclipse-workspace\\SeleniumProj\\Screenshot\\fail\\photo" + Math.random() + ".png");
		try {
			FileHandler.copy(Source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	

}
