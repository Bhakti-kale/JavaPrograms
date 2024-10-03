package assignments;

//Assignment21-WAP on Method Overriding using super keyword in java

class ParentClass1        //parent class
{
	void login()
	{
		System.out.println("login with emailid");
	}
	}

public class Assignment21 extends ParentClass1 //child class
{
	void login()
	{
		super.login();
		System.out.println("login with mobileno");
	}

	public static void main(String[] args)
	{
		Assignment21 s1= new Assignment21();
		s1.login();

	}

}
