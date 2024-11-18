package assignments;

import java.util.ArrayList;
import java.util.Collection;

//WAP using Collection methods
public class Assignment60 
{
	public static void main(String[] args) 
{
		
Collection c1=new ArrayList();//upcasting
c1.add(45);
c1.add("Bhakti");
c1.add(true);
System.out.println(c1);
Collection c2=new ArrayList();
c2.addAll(c1);
c2.add(123);
System.out.println(c2);	
boolean b1=c1.equals(c2);
boolean c3=c2.contains("Nachu");
System.out.println(c3);
boolean c4=c1.containsAll(c2);
System.out.println("ans"+c4);
//c1.clear();
boolean c5=c1.isEmpty();
System.out.println(c5);
c1.remove(45);
System.out.println(c1);
c2.removeAll(c1);
System.out.println(c2);	
int c=c1.size();
System.out.println(c);

}

}
