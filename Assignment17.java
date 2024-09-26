package assignments;


//Assignment 17-WAP on Non Parameterized super calling statement (within different class)

class Reporting2
{
	Reporting2()
	{
		super(); 
	System.out.println("Reporting class constructor");//1
	}
}

class Screenshot2 extends Reporting2
{
	Screenshot2()
	{
		super();   // this will call constructor od reporting class constructor
	System.out.println("Screenshot class constructor");//2
	}
}


public class Assignment17 extends Screenshot2
{
	Assignment17()
	{
		super(); //Explicitly calling super calling statement--this line call screenshot class constructor
		System.out.println("SuperCallingStatement class constructor");//3
	}	

	public static void main(String[] args)
	{
		new Assignment17();

	}

}
