package basic_programs;

import java.util.Scanner;

public class ScannerClassMethods{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		/*System.out.println("Enter a number");
		int num= s1.nextInt();
		System.out.println("Enter decimal number");
		double num1=s1.nextDouble();
		System.out.println("Enter First Name");
		String Firstname= s1.next();
		System.out.println("Are you a graduate?");
		Boolean bi= s1.nextBoolean();
		System.out.println(bi);*/
		
		byte b2=s1.nextByte();// accept input from -128 to 127
		System.out.println(b2);
		s1.close();
	}

}
