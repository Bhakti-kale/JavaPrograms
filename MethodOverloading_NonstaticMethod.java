package basic_programs;

public class MethodOverloading_NonstaticMethod {
	
	void addition(double a,double b)   // nonstatic method
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	void addition(int a,int b)       //nonstatic
	{
		int sum=a+b;
		System.out.println(sum);
	}
    void addition(int a,double b) 
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	void addition(boolean a,String b,char d)
	{
		System.out.println("My name is "+b+" "+d);
	}

	public static void main(String[] args)
	{
		MethodOverloading m1= new MethodOverloading();
		m1.addition(10.20, 20.30);
		m1.addition(10, 20);
		m1.addition(10, 20.30);
		m1.addition(true, "bhakti", 'k');
	}

}
