package basic_programs;

public class NonStatic_Method {

	void addition()
	{
	System.out.println("Adding 2 numbers");
	}
	void subtraction()
	{
	System.out.println("Subtracting 2 numbers");
	}

	public static void main(String[] args)
	{
	System.out.println("Main Method");
	NonStatic_Method ref=new NonStatic_Method();
	ref.addition();
	ref.subtraction();

	}

}
