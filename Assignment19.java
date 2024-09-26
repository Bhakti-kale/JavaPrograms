package assignments;


//Assignment 19-WAP on parameterized this calling statement in java

public class Assignment19 
{
	Assignment19(int b, int c)
	{
		System.out.println("1st");
	}
	
	Assignment19(int a)
	{
		this(12, 14);
		System.out.println("2st");
	}
	

	public static void main(String[] args)
	{
		new Assignment19(10);
		//new ThisCallingStatementParameterized_17(500);
		//ThisCallingStatementParameterized_17 c1= new ThisCallingStatementParameterized_17();   // way to call constructor
		

	}

}
