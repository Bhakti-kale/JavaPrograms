package basic_programs;


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


public class SupercallingstatNonparameterized_17 extends Screenshot2
{
	SupercallingstatNonparameterized_17()
	{
		super(); //Explicitly calling super calling statement--this line call screenshot class constructor
		System.out.println("SuperCallingStatement class constructor");//3
	}	

	public static void main(String[] args)
	{
		new SupercallingstatNonparameterized_17();

	}

}
