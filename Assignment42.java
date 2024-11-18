package assignments;
//WAP from the given string input replace all the Capital letters with Nothing.
//Example: String name= "Manish Kumar Tiwari";
public class Assignment42 {

	public static void main(String[] args) 
	{
		String m1="Manish Kumar Tiwari";
        String answer=m1.replaceAll("[A-Z]", "");
        System.out.println(answer);
        

	}

}
