package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

//How to accept value of array at runtime
public class ArrayChecking2_23 {

	public static void main(String[] args) 
	{
		int rollno[]= new int[4];
		Scanner s1= new Scanner(System.in);
		
		for(int i=0; i<4; i++)
		{
			rollno[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		
		/*rollno[0]= s1.nextInt();
		rollno[1]= s1.nextInt();
		rollno[2]= s1.nextInt();
		rollno[3]= s1.nextInt();
		System.out.println(Arrays.toString(rollno));*/

	}

}
