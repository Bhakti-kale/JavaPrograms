package basic_programs;

public class Constructor_Overloading 
{
	
	Constructor_Overloading()
	{
		System.out.println("1st");
	}
	
	Constructor_Overloading(int a)
	{
		System.out.println("2st");
	}
	Constructor_Overloading(int a, int b)
	{
		System.out.println("3st");
	}
	public static void main(String[] args)
	{
		new Constructor_Overloading();
		new Constructor_Overloading(500);
		new Constructor_Overloading(500, 400);
		Constructor_Overloading c1= new Constructor_Overloading();   // way to call constructor
		

	}

}
