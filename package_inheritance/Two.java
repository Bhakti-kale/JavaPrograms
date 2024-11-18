package package_inheritance;

public class Two extends One
{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}


	public static void main(String[] args)
	{
		Two s1= new Two();
		s1.mul();
		s1.div();
		s1.add();
		s1.sub();
		

	}

}
