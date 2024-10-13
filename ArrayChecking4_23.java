package basic_programs;

import java.util.Arrays;

//Write an array of size 4.Store the array in another array using iteration
public class ArrayChecking4_23 {

	public static void main(String[] args) 
	{
		int array1[]= new int[4];
		array1[0]= 10;
		array1[1]= 20;
		array1[2]= 30;
		array1[3]= 40;
		System.out.println(Arrays.toString(array1));
		
		int array2[]= new int[4];
		for(int i=0; i<4; i++)
		{
			array2[i]=array1[i];
		}
		
		System.out.println(Arrays.toString(array2));
		
		//instead of assigning single single value, it is advisable to use for loop
		/*array2[0]=array1[0];
		array2[1]=array1[1];
		array2[2]=array1[2];
		array2[3]=array1[3];
		System.out.println(Arrays.toString(array2));*/

	}

}
