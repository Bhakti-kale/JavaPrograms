package basic_programs;

import java.util.Arrays;

public class Array_22 {

	public static void main(String[] args) 
	{
		int[] rollno= new int[4];		//declaration
		rollno[0]= 78;					//initialization
		rollno[1]= 74;
		rollno[2]= 71;
		rollno[3]= 60;
		System.out.println(rollno[0]);
		
		
		//another way to print
		for(int i=0; i<=3; i++)
		{
			System.out.println(rollno[i]);
		}
		
		//another way- advised to use
		System.out.println(Arrays.toString(rollno));			//use this to print array
		
		//STring datatype array
				String name[]= new String[3];
				name[0]="Bhakti";
				name[1]="Bhushan";
				name[2]="Nikhil";
				System.out.println(name[0]);
		//char datatype array
				char gender[]= new char[3];
				gender[0]='F';
				gender[1]='M';
				gender[2]='C';
				System.out.println(Arrays.toString(gender));
				
		
	}

}
