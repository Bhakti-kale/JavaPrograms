package assignments;
//WAP where the your name is like "RAM" and print the output like:
/*R
A
M
And Print the second output as like:
M
A
R*/
public class Assignment49 {

	public static void main(String[] args) 
	{
		String s1="RAM";
		//String s3="";
		for(int i=0;i<s1.length();i++)
		{

		char s2=s1.charAt(i);

		System.out.println(s2);
		}
		for(int i=2;i>=0;i--)
		{
			char s2=s1.charAt(i);	



		System.out.println(s2);	}	
	}

}
