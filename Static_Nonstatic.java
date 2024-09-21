package basic_programs;

public class Static_Nonstatic {

	static void addition()
	{
	System.out.println("Adding 2 numbers");
	}
	void subtraction()
	{
	System.out.println("Subtracting 2 numbers");
	}

	public static void main(String[] args)
	{
	addition();
	Static_Nonstatic ref1=new Static_Nonstatic();
	ref1.subtraction();

	}
}
