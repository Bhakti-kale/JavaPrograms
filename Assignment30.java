package assignments;

import java.util.Arrays;

//Write a array program to update the array value.
public class Assignment30 {

	public static void main(String[] args) 
	{
		int num[]= new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println(Arrays.toString(num));
		num[2]=40;									//updating array value
		System.out.println(Arrays.toString(num));
		

	}

}
