package assignments;


//Assignment 14-Single level inheritance by using Static methods


class One                //parent/super class
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}

}

public class Assignment14 extends One      // sub/child class
{
	
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args)
	{
		mul();
		div();
		add();
		sub();
		
	}

}