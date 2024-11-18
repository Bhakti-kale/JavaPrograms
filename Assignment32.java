package assignments;
//Write a program to check whether the two given arrays are equal or not.

import java.util.Arrays;

public class Assignment32 {

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
		if(b1==true) {
			System.out.println("given two arrays are same");
		}
		else {
			System.out.println("given two arrays are not same");
		}
	
	}

}
