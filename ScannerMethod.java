package basic_programs;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) 
	{
		
		Scanner s1= new Scanner(System.in);
		//System.out.println("Entrt name");
		//String Firstname= s1.next();
		//System.out.println(Firstname);
		System.out.println("Are u graduate");
		boolean b1= s1.nextBoolean();
		System.out.println(b1);
		s1.close();

	}

}
