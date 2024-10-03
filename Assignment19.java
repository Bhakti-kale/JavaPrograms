package assignments;


//Assignment 19-WAP on parameterized and Non parameterized this calling statement in java

public class Assignment19 
{
	Assignment19(int b, int c)
	{
		System.out.println("Parameterized");
	}
	
	Assignment19()
	{
		this(12, 14);
		System.out.println("Non Parameterized");
	}
	

	public static void main(String[] args)
	{
		new Assignment19();
		//new ThisCallingStatementParameterized_17(500);
		//ThisCallingStatementParameterized_17 c1= new ThisCallingStatementParameterized_17();   // way to call constructor
		

	}

}
