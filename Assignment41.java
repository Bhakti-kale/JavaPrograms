package assignments;
//WAP from the given string input replace all the alphabets with Nothing.
//Example: String name= "kv no 2";
public class Assignment41 {

	public static void main(String[] args) 
	{
		String n="kv no 2";
        String n4=n.replaceAll("[a-z]", "");
        System.out.println(n4);
        
	}

}
