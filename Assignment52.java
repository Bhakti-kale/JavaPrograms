package assignments;

import basic_programs.InterfaceLearning_20;

//Create class and inherit property of interface
	interface Amazon1
	{
		void login();
		void registration();
	}

	public class Assignment52 implements Amazon1
	   {

		public static void main(String[] args) 
		{
			Assignment52 a= new Assignment52();
			a.login();
			a.registration();

		}

		@Override
		public void login() {
			// TODO Auto-generated method stub
			System.out.println("login");
		}

		@Override
		public void registration() {
			// TODO Auto-generated method stub
			System.out.println("registration");
		}
	
	
	   }
