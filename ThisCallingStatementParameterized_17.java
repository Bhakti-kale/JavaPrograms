package basic_programs;

public class ThisCallingStatementParameterized_17 
{
	
	ThisCallingStatementParameterized_17(int b, int c)
	{
		System.out.println("1st");
	}
	
	ThisCallingStatementParameterized_17(int a)
	{
		this(12, 14);
		System.out.println("2st");
	}
	

	public static void main(String[] args)
	{
		new ThisCallingStatementParameterized_17(10);
		//new ThisCallingStatementParameterized_17(500);
		//ThisCallingStatementParameterized_17 c1= new ThisCallingStatementParameterized_17();   // way to call constructor
		

	}
}