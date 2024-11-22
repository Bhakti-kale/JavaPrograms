package assignments;
//WAP in which we are writing extends & implements keywords in a subclass
	interface one11
	{
		void add1();
	}
	interface two1 extends one11
	{
		void add();
	}
	class new1
	{
		void newmethod()
		{
			System.out.println("newmethod");
		}
	}
	public class Assignment53 extends new1 implements two1,one11
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assignment53 a= new Assignment53();
			a.add();
			a.add1();
			a.newmethod();

		}

		@Override
		public void add1() {
			// TODO Auto-generated method stub
			System.out.println("add1");
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("add");
		}
	}
