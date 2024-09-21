package basic_programs;

import java.util.Scanner;

public class Scanner_AreaOfRectangle {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of length");
		int l=s1.nextInt();
		System.out.println("Enter value of width");
		double b=s1.nextDouble();

		double area=l*b;
		System.out.println("Area of rectangle is="+ area);

	}

}
