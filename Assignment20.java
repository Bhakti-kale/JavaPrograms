package assignments;

//Assignment 20-WAP on Method Overriding


class ParentClass         //parent class
{
	void login()
	{
		System.out.println("login with emailid");
	}
	}

public class Assignment20 extends ParentClass //child class
{
	void login()
	{
		System.out.println("login with mobileno");
	}

	public static void main(String[] args)
	{
		Assignment20 s1= new Assignment20();
		s1.login();

	}

}

