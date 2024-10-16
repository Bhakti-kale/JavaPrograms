package assignments;
//WAP to compare the String by using the method equalIgnoreCase.
public class Assignment37 {

	public static void main(String[] args) 
	{
		String s1="BHAKTI";
		String s2="bhakti";
		boolean b1=s1.equalsIgnoreCase(s2);
		if(b1==true)
		{
			System.out.println("Equal");
			
		}
		else
		{
			System.out.println("NotEqual");
			}

	}

}
