package basic_programs;
//Check if 2 arrays are equals to each other
import java.util.Arrays;

public class ArrayChecking1_23 {

	public static void main(String[] args) 
	{
		int num1 []= new int[4];
		num1[0]= 78;
		num1[1]= 79;
		num1[2]= 76;
		num1[3]= 75;
		
		int num2 []= new int[4];
		num2[0]= 78;
		num2[1]= 79;
		num2[2]= 76;
		num2[3]= 75;
		
		boolean b1= Arrays.equals(num1, num2);
		System.out.println(b1);
		
	}

}
