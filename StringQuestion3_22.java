package basic_programs;
//contains function- will check if particular string is part of given string
public class StringQuestion3_22 {

	public static void main(String[] args) 
	{
		String input= "Bhakti Manoj Kale";
		boolean b1=input.contains("Manoj");
		System.out.println(b1);
		
		boolean b2= input.contains("kaleb");
		System.out.println(b2);

	}

}
