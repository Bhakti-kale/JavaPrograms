package basic_programs;

abstract class Google_Auth
{
	abstract void login();			//abstract methods {which does not have implementation}
	abstract void registration();	//abstract methods
}

public class Abstractclasss_19 extends Google_Auth
{
	
	void login() 		//Concrete methods (which have implementation)
	{
		System.out.println("Concrete methods login");
		
	}

	
	void registration() 	//Concrete methods
	{
		
		System.out.println("Concrete methods registration");
	}

	public static void main(String[] args) 
	{
		Abstractclasss_19 s1=new Abstractclasss_19();
		s1.login();
		s1.registration();

	}

	
	

}
