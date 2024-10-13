package basic_programs;

public class ThisCallingStatementNonparameterized_17
{
	ThisCallingStatementNonparameterized_17()
	{
		System.out.println("1st");
	}
	
	ThisCallingStatementNonparameterized_17(int a)
	{
		this();                                         //calling nonparameterized constructor
		System.out.println("2st");
	}
	

	public static void main(String[] args)
	{
		new ThisCallingStatementNonparameterized_17(10);
		
	}

}
