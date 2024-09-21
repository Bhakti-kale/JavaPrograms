package basic_programs;

public class Mainmethod_overload {

	public static void main(String[] args)
	{
		System.out.println("Main Method");
		main();
		main("Ramu",'M');

	}
	public static void main()
	{
		System.out.println("Main method with no arg");

	}
	public static void main(String name, char gender)
	{
		System.out.println("Msin method with arg");

	}

}
