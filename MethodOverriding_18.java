package basic_programs;

class ParentClass         //parent class
   {
	void login()
	{
		System.out.println("login with emailid");
	}
	}

public class MethodOverriding_18 extends ParentClass //child class
{
	void login()
	{
		super.login();
		System.out.println("login with mobileno");
	}

	public static void main(String[] args)
	{
		MethodOverriding_18 s1= new MethodOverriding_18();
		s1.login();

	}

}
