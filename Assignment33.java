package assignments;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to accept the array at runtime
public class Assignment33 {

	public static void main(String[] args) 
	{
      String studentName[]=new String[3];
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Student name: ");
		
		for(int i=0;i<studentName.length;i++) {
			studentName[i]=s1.next();
			
			}
		System.out.println(Arrays.toString(studentName));

	}

}
