package basic_programs;

public class String_Matches_fun_25 {

	public static void main(String[] args) 
	{
		//check if given string has exact 3 letters in it
		String s="cat";
		boolean s1=s.matches("...");
		System.out.println(s1);
		
		//check if the string starts with c
		String a="cat";
        boolean b1=a.matches("c(.*)");
        System.out.println(b1);
        
        //check if given input ends with t
        boolean b2=a.matches("(.*)t");
        System.out.println(b2);
        
        //check if n is present in given string
        String a1="manish";
        boolean b4=a1.matches("(.*)n(.*)");
        System.out.println(b4);
        
        //replace all the spaces with underscore in given string
        String d= "Manish Kumar Tiwari";
        String d1= d.replaceAll(" ", "_");
        System.out.println(d1);


	}

}
