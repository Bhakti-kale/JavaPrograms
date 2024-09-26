package assignments;

//Assignment 18-WAP on Parameterized super calling statement (within multiple class)

class Reporting1
{
	Reporting1(String a)
	{
		super(); 
	System.out.println("Reporting class constructor");//1
	}
}

class Screenshot1 extends Reporting1
{
	Screenshot1(int a, int b)
	{
		super("Bhakti");   // this will call constructor od reporting class constructor
	System.out.println("Screenshot class constructor");//2
	}
}


public class Assignment18 extends Screenshot1
{
	Assignment18()
	{
		super(10, 20); //Explicitly calling super calling statement--this line call screenshot class constructor
		System.out.println("SuperCallingStatement class constructor");//3
	}	

	public static void main(String[] args)
	{
		new Assignment18();

	}

}