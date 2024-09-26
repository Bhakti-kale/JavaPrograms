package assignments;


//Assignment 16-Multi level inheritance by using static and Non Static methods by using 4 classes

class Grandfather
{
	static void add()
	{
	System.out.println("add");
	}
	
	void add1()
	{
		System.out.println("add1");
	}
	
}

class Father extends Grandfather
{
	static void sub()
	{
	System.out.println("sub");
	}
	
	void sub1()
	{
	System.out.println("sub1");
	}
	
}
class Son extends Father
{
	static void div()
	{
	System.out.println("Div");
	}
	
	void div1()
	{
	System.out.println("Div1");
	}
	
}

public class Assignment16 extends Son
{
	 static void mul()
	{
	System.out.println("mul");
	}
	
	 void mul1()
		{
		System.out.println("mul1");
		}
	public static void main(String[] args)
	{
		Assignment16 s1= new Assignment16();
		
		System.out.println("calling static methods");
		
		add();
		sub();
		div();
		mul();
		
		System.out.println("Calling nonstatic methods");
		
		s1.add1();
		s1.sub1();
		s1.div1();
		s1.mul1();

	}

}
