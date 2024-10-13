package basic_programs;

import java.util.Arrays;

//in the given string find out the number of alphabet, numeric, spaces, special character involved---using wrapper class-Character
public class CountofAlphanumericspaces_Wrapperclass_24 {

	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_spaces;
	public static void main(String[] args) 
	{
		String input= "kv no 2 bangalore";
		char c1[]= input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<input.length(); i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			//System.out.println(b1);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			
			boolean b3= Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_spaces++;
			}
			
		}
		System.out.println("The count of alphabet is "+count_of_alphabet);
		System.out.println("The count of numeric is "+count_of_numeric);
		System.out.println("The count of spaces is "+count_of_spaces);
		
		int count_of_special_char = input.length()-(count_of_alphabet+count_of_numeric+count_of_spaces);
		System.out.println("The count of special char is "+count_of_special_char);

	}

}
