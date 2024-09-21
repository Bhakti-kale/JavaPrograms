package basic_programs;

public class Operations_nonstaticmethod {
	 void addition() 
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("Addition of a and b is " + sum);
	}
	
	 void subtraction() 
	{
		int a=100;
		int b=20;
		int sub=a-b;
		System.out.println("subtraction of a and b is " + sub);
	}
	
	 void multiplication() 
	{
		int a=100;
		int b=20;
		int mul=a*b;
		System.out.println("multiplication of a and b is " + mul);
	}

	 void division() 
	{
		int a=100;
		int b=20;
		int div=a/b;
		System.out.println("division of a and b is " + div);
	}
	
	 void modulus() 
	{
		int a=100;
		int b=20;
		int mod=a%b;
		System.out.println("modulus of a and b is " + mod);
	}
	

	public static void main(String[] args)
	{
		Operations_nonstaticmethod s1=new Operations_nonstaticmethod();
		s1.addition();
		s1.subtraction();
		s1.multiplication();
		s1.division();
		s1.modulus();

	}

}
