package assignments;


//Assignment 20-WAP on parameterized and non-parameterized this calling statement in java

public class Assignment20 
{
	Assignment20()
	{
		System.out.println("1st");
	}
	
	Assignment20(int a)
	{
		this();                                         //calling nonparameterized constructor
		System.out.println("2st");
	}
	

	public static void main(String[] args)
	{
		new Assignment20(10);
		//new Assignment20();
		
	}


}
