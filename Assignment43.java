package assignments;
//WAP from the given string input replace all the entire numerics with Nothing.
//Example: String name= "ram's bank balance is 89765 INR";
public class Assignment43 {

	public static void main(String[] args) 
	{
		String a1="ram's bank balance is 89765 INR";
        String a3=a1.replaceAll("[0-9]", "");
        System.out.println(a3);

	}

}
