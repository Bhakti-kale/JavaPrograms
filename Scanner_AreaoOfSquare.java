package basic_programs;

import java.util.Scanner;

public class Scanner_AreaoOfSquare {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter the value of side");
		int a= s1.nextInt();
		int Area=a*a;
		System.out.println("Area of square is="+ Area);

	}

}
