package basic_programs;

public class Assertkeyword_13 {

	public static void main(String[] args) 
	{
		int age=17;
		//assert age>=18; 
		assert age>=18: "sorry but age is not as expected"; /// assert execute only if condition failing give assertion error
		System.out.println("age of person is " +age);

	}

}
 