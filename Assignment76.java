package assignments;
//Wap for classtypecasting(combination of upcasting and downcasting)

class object
	{
		void sub()
		{
			System.out.println("perform subtraction");
		}
	}
	class parento extends object{
		void add()
		{
			System.out.println("perform addition");	
		}
	}
	public class Assignment76 extends parento {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			parento p1	=new Assignment76();//upcasting
			p1.add();
			p1.sub();
			Assignment76 c1=(Assignment76) p1;//downcasting
			child c2=new child();
			c2.mult();
		}

	}
	class child extends Assignment76
	{
		void mult()
		{
			System.out.println("perform multiplication");
		}
		}

