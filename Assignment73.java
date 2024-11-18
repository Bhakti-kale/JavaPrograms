package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//Wap to handle the exception using try and multiple  catch methods
public class Assignment73 
{
	public static void main(String[] args) 
	{
		try 
		{
		Scanner s1=new Scanner(System.in);
		//System.out.println("please enter size of array");
		int size= s1.nextInt();					//-1 then try 1
		int[] rollno=new int[size];
		rollno[0]=78;
		rollno[1]=97;
		rollno[2]=96;
		}
		catch(NegativeArraySizeException a1)
		{
			System.out.println("Array size can only be positive numeric value. please enter correct value");
			Scanner s1=new Scanner(System.in);
			int size= s1.nextInt();					//-1
			int[] rollno=new int[size];
			
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("size of your array is less. please enter correct value");
			Scanner s1=new Scanner(System.in);
			int size= s1.nextInt();					//1
			int[] rollno=new int[size];
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Array size can only be positive numeric value. please enter correct value");
			Scanner s1=new Scanner(System.in);
			int size= s1.nextInt();					//mkt
			int[] rollno=new int[size];
			
		}
		finally
		{
			System.out.println("finally--close db connection");
		}
	}

}
