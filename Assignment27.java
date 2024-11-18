package assignments;
//Write a program where you get an array index out of bound exception.
public class Assignment27 {

	public static void main(String[] args) 
	{
       int[]rollNo=new int [4];
		
		rollNo[0]=1;
		rollNo[1]=2;
		rollNo[2]=3;
		rollNo[3]=4;
		rollNo[4]=5;	
		
		for (int i=0;i<rollNo.length;i++) {
			System.out.println(rollNo[i]);
			
		}
	}

}
