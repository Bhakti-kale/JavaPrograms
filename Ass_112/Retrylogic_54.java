package assignments.Ass_112;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic_54 implements IRetryAnalyzer
{
	int initialcount=0;
	int retrytimes=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialcount<retrytimes) 
		{
			initialcount++;
			return true;	//retry now
		}
		
		return false;		//don't retry
	}

}
