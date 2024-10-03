package assignments;
//Assignment22-WAP in which abstract class is present along with concrete class


abstract class Google_Auth
{
	abstract void login();			//abstract methods {which does not have implementation}
	abstract void registration();	//abstract methods
}

public class Assignment22 extends Google_Auth
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
		Assignment22 s1=new Assignment22();
		s1.login();
		s1.registration();

	}	

}

