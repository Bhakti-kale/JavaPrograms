package assignments;

//Assignment23-WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM

class Supermost
{
	void methd5()
	{
		System.out.println("CM5");
	}
	void methd6()
	{
		System.out.println("CM6");
	}
}

abstract class Parentclasss extends Supermost
{
	abstract void methd1();
	abstract void methd2();
	void methd3()
	{
		System.out.println("CM3");
	}
	void methd4()
	{
		System.out.println("CM4");
	}
}



public class Assignment23 extends Parentclasss
{
	
	
  public static void main(String[] args) 
  {
	  Assignment23 s1=new Assignment23();
	  s1.methd1();
	  s1.methd2();
	  s1.methd3();
	  s1.methd4();
	  s1.methd5();
	  s1.methd6();
  }


void methd1() 
{
	System.out.println("CM1");
}


void methd2() 
{
	System.out.println("CM2");
}
}
