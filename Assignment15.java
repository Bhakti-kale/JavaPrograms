package assignments;



//Assignment 15-Single level inheritance by using Non Static methods


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

public class Assignment15 extends Onetwo      // sub/child class
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
		Assignment15 obj1= new Assignment15();
		//Onetwo obj= new Onetwo();
		
		obj1.mul();
		obj1.div();
		obj1.add();
		obj1.sub();
		
	}

}
