package assignments;
//WAP to check from the given string exact letters count. 

//Example: String name= "kv no 2";
public class Assignment44 {

	public static void main(String[] args) {
		int count=0;
		
String s1="kv no 2";
String s2=s1.replaceAll(" ", "");

for(int i=0;i<s2.length();i++) {
	count++;
	
}
System.out.println(count);
	}

}