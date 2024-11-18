package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//PLease use backward iteration using listiterator for arraylist without farward iteration 
//and note down the error
public class Assignment63 {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		List l1 = new ArrayList();
		l1.add(45);
		l1.add(50);
		l1.add(55);
		l1.add(60);
		ListIterator l2 = l1.listIterator();
		System.out.println(l1);
		while (l2.hasPrevious()) {
			System.out.println(l2.next());
		}
	}

}
