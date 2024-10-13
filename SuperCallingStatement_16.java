package basic_programs;

class Reporting
{
	Reporting()
	{
		super(); 
	System.out.println("Reporting class constructor");//1
	}
}

class Screenshot extends Reporting
{
	Screenshot()
	{
		super();   // this will call constructor od reporting class constructor
	System.out.println("Screenshot class constructor");//2
	}
}


public class SuperCallingStatement_16 extends Screenshot
{
	SuperCallingStatement_16()
	{
		super(); //Explicitly calling super calling statement--this line call screenshot class constructor
		System.out.println("SuperCallingStatement class constructor");//3
	}	

	public static void main(String[] args)
	{
		new SuperCallingStatement_16();

	}

}
//note:if didn't call super class in constructor explicitly then also it will call constructor of parent class implicitly