package basic_programs;
// How to reverse a string
public class StringQuestion1_22 {

	public static void main(String[] args) 
	{
		String input= "abcd";
		String output= "";
		for(int i=3; i>=0; i--)
		{
			char c= input.charAt(i);
			output= output+c;
		}
			System.out.println(output); 	
		
		/* 2nd way
		String input= "abcd";
		String ouput= "";
		for(int i=3; i>=0; i--)
		{
			char c= input.charAt(i);
			System.out.println(c); 
		}*/
			
		/* 1st way
		String input= "abcd";
		String ouput= "";
		System.out.println(input.charAt(3));
		System.out.println(input.charAt(2));
		System.out.println(input.charAt(1));
		System.out.println(input.charAt(0));
		*/
	}

}
