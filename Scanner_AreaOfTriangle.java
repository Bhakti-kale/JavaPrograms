package basic_programs;

import java.util.Scanner;

public class Scanner_AreaOfTriangle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enetr the value of height");
		int h=s1.nextInt();
		System.out.println("Enter the value of base");
		int b=s1.nextInt();
		double Area=0.5*b*h;
		System.out.println("Area if triangle= " +Area);


	}

}
