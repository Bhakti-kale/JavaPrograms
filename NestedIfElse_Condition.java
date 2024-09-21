package basic_programs;

public class NestedIfElse_Condition {

	public static void main(String[] args)
	{
		char gender1='M';
		char gender2='F';
		int age=10;
		if(gender1=='M')
		{
			if(age>12)
			{
				System.out.println("Adult");
			}
			else
			{
				System.out.println("halfticket");
			}
			
		
		}
		else
		{
			System.out.println("its free for female");
		}

	}

}
