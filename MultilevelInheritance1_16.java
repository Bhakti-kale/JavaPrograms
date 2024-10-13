package basic_programs;

class Inheritence3
{
	static void add()
	{
	System.out.println("add");
	}
	
}

class Inheritence2 extends Inheritence3
{
	static void sub()
	{
	System.out.println("sub");
	}
	
}

public class MultilevelInheritance1_16 extends Inheritence2
{
	static void mul()
	{
	System.out.println("mul");
	}
	
	public static void main(String[] args)
	{
		mul();
		add();
		sub();
	}

}
