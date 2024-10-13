package basic_programs;
abstract class Class3
{
	abstract void method1();    //abstract method
	abstract void method2();    //abstract method
	void method4()              //concrete method
	{
		System.out.println("Logic");
	}
}

abstract class Class2 extends Class3
{
	abstract void method3();		//abstract method
	abstract void method5();		//abstract method
}

public class Abstractclass_19 extends Class2{

	public static void main(String[] args) 
	{
		Abstractclass_19 s1=new Abstractclass_19();
		s1.method1();
		s1.method2();
		s1.method3();
		s1.method4();
		s1.method5();

	}

	
	void method3()
	{
		
		
	}

	void method5() 
	{
		
		
	}


	
	void method1() 
	{
		
		
	}


	
	void method2() 
	{
		
		
	}

}
