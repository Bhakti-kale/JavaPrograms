package assignments;

import java.util.Arrays;

//WAP where the size of the array is 4, and check whether a given value (such as 38) is a part of the array or not.
public class Assignment34 {

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
