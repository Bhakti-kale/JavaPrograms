package basic_programs;

import java.util.Scanner;

public class Scanner_CicumferenceOfCircle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi=s1.nextDouble();

		System.out.println("Enter the value of radius");
		int r=s1.nextInt();

		double C=2*pi*r;
		System.out.println("Circumference of Circle "+C);

	}

}
