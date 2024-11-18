package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//WAP using Iterator (process of iteration through iterable )
public class Assignment64 
{
	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add(76);
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(760);
		l1.add(706);
		l1.add(607);
		l1.add(67);
		l1.add(null);
		System.out.println(l1);
		Iterator i1= l1.iterator();
		while(i1.hasNext()) 						//return type is boolean
		{
			System.out.println(i1.next()); 			//return type is next() method is object
		}
		
		

	}


}
