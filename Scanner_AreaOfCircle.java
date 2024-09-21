package basic_programs;

import java.util.Scanner;

public class Scanner_AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi=s1.nextDouble();

		System.out.println("Enter the value of radius ");
		int r= s1.nextInt();

		double Area=pi*r*r;
		System.out.println("Area of Circle is "+Area);
		s1.close();

	}

}
