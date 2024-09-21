package basic_programs;

import java.util.Scanner;

public class IFElse_Condition
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
			int ageofperson=			s1.nextInt();

		
		if(ageofperson>=18)
		{
			System.out.println("YOu are Eligibal to Vote");
		}
		else
		{
			System.out.println("YOu are not Eligibal to Vote");
		}
		
		
		
	}

}
