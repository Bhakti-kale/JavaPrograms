package assignments;

//WAP to access the 4 access specifiers within the same package
class TestCase1 
{

	public void add()
	{
		System.out.println("public method");
	}
	private void sub()
	{
		System.out.println("private method");
	}
	void mul()
	{
		System.out.println("default method");
	}
	
	protected void div()
	{
		System.out.println("protewcted method");
	}
}
public class Assignment55 
{
	public static void main(String[] args) {
		TestCase1 s1=new TestCase1();
		s1.add();	//public method
		s1.mul();	//default
		s1.div();	//protected

}
}
