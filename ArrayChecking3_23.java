package basic_programs;

import java.util.Arrays;

//write the array of size 4 and check if 38 value is part of your array.
public class ArrayChecking3_23 {

	public static void main(String[] args) 
	{
		int student[]= new int[4];
		student[0]= 30;
		student[1]= 33;
		student[2]= 36;
		student[3]= 38;
		System.out.println(Arrays.toString(student));
		
		int NoToCheck=38;
		
		for(int i=0; i<4; i++)
		{
			if(NoToCheck==student[i])
			{
				//System.out.println("38 is present in array");
				//System.out.println("The given no is the part of array at index position "+i);
				System.out.println(NoToCheck+" is a part of array at the index position "+i);
			}
		}
			

	}

}
