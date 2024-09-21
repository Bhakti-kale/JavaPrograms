package basic_programs;

public class Operations_Staticmethod{
	
	
	static void addition() 
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("Addition of a and b is " + sum);
	}
	
	static void subtraction() 
	{
		int a=100;
		int b=20;
		int sub=a-b;
		System.out.println("subtraction of a and b is " + sub);
	}
	
	static void multiplication() 
	{
		int a=100;
		int b=20;
		int mul=a*b;
		System.out.println("multiplication of a and b is " + mul);
	}

	static void division() 
	{
		int a=100;
		int b=20;
		int div=a/b;
		System.out.println("division of a and b is " + div);
	}
	
	static void modulus() 
	{
		int a=100;
		int b=20;
		int mod=a%b;
		System.out.println("modulus of a and b is " + mod);
	}
	public static void main(String[] args)
	{
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
		
		
		
	}

}
