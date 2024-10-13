package basic_programs;

interface Amazon
{
	void login();
	void registration();
}

public class InterfaceLearning_20 implements Amazon
   {

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void login() 
	{
		System.out.println("Real Logic");
		
	}

	@Override
	public void registration() 
	{
		System.out.println("Real Logic");
		
	}

}
