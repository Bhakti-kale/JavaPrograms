package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//WAP using ListIterator
public class Assignment65 
{
	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(760);
		l1.add(706);
		l1.add(607);
		l1.add(67);
		ListIterator l2	=l1.listIterator();
		System.out.println("Forward Iterator");
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
		System.out.println("Backward iterator");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}

	}


}
