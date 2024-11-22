package assignments;
//WAP in which super most interface class having 2AM, abstract class having 2AM&2CM, subclass having 2CM

abstract class Class3
{
	abstract void method1();    //abstract method
	abstract void method2();    //abstract method
	void method4()              //concrete method
	{
		System.out.println("method 4");
	}
}

abstract class Class2 extends Class3
{
	abstract void method3();		//abstract method
	abstract void method5();		//abstract method
}

public class Assignment51 extends Class2{
	void method6()
	{
		System.out.println("method 6");
	}
	void method7()
	{
		System.out.println("method 7");
	}

	public static void main(String[] args) 
	{
		Assignment51 s1=new Assignment51();
		s1.method1();
		s1.method2();
		s1.method3();
		s1.method4();
		s1.method5();
		s1.method6();
		s1.method7();

	}
	@Override
	void method3() 
	{
		System.out.println("method 3");
		
	}
	@Override
	void method5() {
		// TODO Auto-generated method stub
		System.out.println("method 5");
	}
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}
	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}

	

}
