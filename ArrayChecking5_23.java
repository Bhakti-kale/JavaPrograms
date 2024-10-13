package basic_programs;

import java.util.Arrays;

//Take array of size 4,Copy array into another array in reverse order
public class ArrayChecking5_23 {

	public static void main(String[] args) 
	{
		int students[]= new int[4];
		students[0]= 10;
		students[1]= 20;
		students[2]= 30;
		students[3]= 40;
		//System.out.println(Arrays.toString(students));
		
		int students1[]= new int[4];
		
		for(int i=0, k=3; i<students.length; i++, k--)
		{
			students1[k]=students[i];
		}
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(students1));

	}

}
