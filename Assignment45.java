package assignments;
//WAP to check from the  given string find the letter start with capital M or not. 
//Example: String name= "My name is Ram";

public class Assignment45 {

	public static void main(String[] args) 
	{
		String s1="My name is Ram";
		boolean s2=s1.matches("M(.*)");
		if (s2==true)
		{
			System.out.println("starts with M");
			
		}
		else
		{
			System.out.println("Not staarts with M");
		}

	}

}
