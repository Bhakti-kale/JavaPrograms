package basic_programs;

public class StringFunctions_21 {

	public static void main(String[] args) 
	{
		String a= "Automation";
		
		int l1= a.length();				//to find length of string
		System.out.println(l1);
		
		String l2= a.toUpperCase();		//to convert string into uppercase
		System.out.println(l2);
		
		String l3= a.toLowerCase();		//to convert string into lowecase
		System.out.println(l3);
		
		char c1= a.charAt(5);			//to find/print character at particular index
		System.out.println(c1);
		
		String b= "Testing";
		
		System.out.println(a.concat(b)); 	//to combine two strings
		System.out.println(a.concat("Engineer"));
		
		String c= " automation testing by mkt ";
		System.out.println(c);
		
		System.out.println(c.trim());  		//remove extra spaces present after n before string. not middle of string
		System.out.println(c.isEmpty());
		
		//substring(start index)----print from that index to till end of string
		System.out.println(a.substring(2));
		
		//substring(start index, end index)----print from that index to (end index-1)
		System.out.println(a.substring(2, 5)); 		//it will print from index 2 to 4--tom
		

	}

}
