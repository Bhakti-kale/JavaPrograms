package assignments;

//WAP to access the 4 access specifiers within the same class
public class Assignment54 
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
		Assignment54 s1=new Assignment54();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
	}
}
