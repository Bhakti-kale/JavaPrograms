package basic_programs;

public class MethodOverloading_staticMethod {
	static void addition(double a,double b) 
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(int a,int b) 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(int a,double b) 
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(boolean a,String b,char d)
	{
		System.out.println("My name is "+b+" "+d);
	}

	public static void main(String[] args)
	{
		addition(20.10, 30.10);
		addition(10, 20);
		addition(10, 20.30);
		addition(true, "bhakti", 'k');
	}


}
