package assignments;

import java.util.ArrayList;
import java.util.List;

//WAP using upcasting concept
public class Assignment66 
{
	public static void main(String[] args) 
	{
		
ArrayList a1=new ArrayList();
List li=new ArrayList();//upcasting
li.add(45);
li.add("Bhakti");
li.add(null);
li.add("Bhakti");
List l1=new ArrayList();
l1.addAll(li);
System.out.println(l1);
	}

	

}
