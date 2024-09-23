package basic_programs;

 class Onetwo                //parent/super class
{
	 void add()
	{
		System.out.println("add");
	}
	 void sub()
	{
		System.out.println("sub");
	}

}

public class Inheritancesinglelevelnonstatic_15 extends Onetwo      // sub/child class
{
	
	 void mul()
	{
		System.out.println("mul");
	}
	 void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args)
	
	{
		Inheritancesinglelevelnonstatic_15 obj1= new Inheritancesinglelevelnonstatic_15();
		//Onetwo obj= new Onetwo();
		
		obj1.mul();
		obj1.div();
		obj1.add();
		obj1.sub();
		
	}

}

