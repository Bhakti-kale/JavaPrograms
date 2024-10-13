package basic_programs;
//tocharArray---this function convert string to a sequencce of character, lengh of putput array is equal to length 
//of string and char in the array are in same order as the charcter in the string
import java.util.Arrays;

public class StringQuestion4_22 {

	public static void main(String[] args) 
	{
		String s1= "short";
		char[] c1= s1.toCharArray();
		System.out.println(Arrays.toString(c1));

	}

}
