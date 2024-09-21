package basic_programs;

import java.util.Scanner;

public class SwitchcaseUsingScanner_13 {
	
	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Press 1 to launch chrome");
		System.out.println("Press 2 to launch edge");
		System.out.println("Press 3 to launch safari");
		System.out.println("Press 4 to launch firefox");
		
		int input= s1.nextInt();
		
		switch(input)
		{
		case 1: System.out.println("Launching chrome");
				break;
				
		case 2: System.out.println("Launching edge");
				break;	
		
		case 3: System.out.println("Launching safari");
				break;
		
		case 4: System.out.println("Launching firefox");
				break;
		
		default: 
			    System.out.println("Your selection is wrong, please try again");
				
		}


	}


}
