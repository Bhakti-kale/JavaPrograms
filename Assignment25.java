package assignments;

public class Assignment25 {

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
		

	}

}
