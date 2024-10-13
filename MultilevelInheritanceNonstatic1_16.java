package basic_programs;

class Inheritence4
{
	 void add()
	{
	System.out.println("add");
	}
	
}

class Inheritence5 extends Inheritence4
{
	 void sub()
	{
	System.out.println("sub");
	}
	
}

public class MultilevelInheritanceNonstatic1_16 extends Inheritence2
{
	 void mul()
	{
	System.out.println("mul");
	}
	
	public static void main(String[] args)
	{
		MultilevelInheritanceNonstatic1_16 s1= new MultilevelInheritanceNonstatic1_16();
		s1.add();
		s1.sub();
		s1.mul();

	}

}
