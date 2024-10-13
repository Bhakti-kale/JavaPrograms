package basic_programs;

public class String_Replace_Function_25 {

	public static void main(String[] args) 
	{
		//
		 String name="Manish";
         boolean b1=        name.equalsIgnoreCase("manish");
         System.out.println(b1);
         
         //replace k with n
         String name1="kv no 2";
         String n1=name1.replace('k', 'n');
         System.out.println(n1);
         
         //Replace boy with girl
         String n2="I have a boy";
         String n3=n2.replace("boy", "girl");
         System.out.println(n3);
         
         //replace 2 with nothing
         String name2="kv no 2";
         String n5=        name2.replace("2", "");
         System.out.println(n5);
         
         //replace alphabet with nothing
         String n="kv no 2";
         String n4=n.replaceAll("[a-z]", "");
         System.out.println(n4);
         
         //replace all capital letters with nothing
         String m1="Manish Kumar Tiwari";
         String answer=m1.replaceAll("[A-Z]", "");
         System.out.println(answer);
         
         //replace entire numeric letters with nothing
         String a1="ram's bank balance is 89765 INR";
         String a3=a1.replaceAll("[0-9]", "");
         System.out.println(a3);
          }

	}

