package assignments;
//Write a program where to check the given strings are palindrome or not.
public class Assignment26 {

	public static void main(String[] args) 
	{
		String input= "radar";			//always use lowecase or uppercase leeter in string. if not given then convert it to upper and lowe case and then do the operation on string
		String output= "";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			char c1= input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		boolean b1=input.equals(output);
		
		if(b1==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}


	}

}
