package assignments;

import java.util.HashSet;
import java.util.Set;

//WAP to utilize add method from Set Interface
public class Assignment67 
{
	public static void main(String[] args) 
	{
		Set s1= new HashSet();
		//Set <Integer> s1= new HashSet<Integer>();
		s1.add(56);
		s1.add(75);
		s1.add(96);
		s1.add(12);
		s1.add("MK");
		s1.add('x');
		System.out.println(s1);
		//set does not follow indexing
		//set does not follow order of insertion
		s1.add(56);
		s1.add(56);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		//does not accept duplicate
		//accept null only once
		s1.add("Moon");
		s1.add("Sun");
		System.out.println(s1);

	}


}
