package packageaccessspecifier20;
//case1- What happens within the class- all methods accessible
public class TestCase1 
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
	public static void main(String[] args) 
	{
		TestCase1 s1=new TestCase1();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
	}

}
