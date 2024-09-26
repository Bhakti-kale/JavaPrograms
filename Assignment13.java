package assignments;

//Assignment 13-WAP on thread class (thread.sleep)

public class Assignment13 {
	public static void main(String[] args) throws InterruptedException
	{
	for(int i=1;i<=10;i++)
	{
	System.out.println(Math.random());// will give double value between 0 and 1
	Thread.sleep(1000); //to stop program execution for sometime ie 1000 ms
	}
	
	}


}

