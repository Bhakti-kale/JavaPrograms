package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//WAP using the Map interface and iterate over its entries using an Iterator with a while loop.
public class Assignment69 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "AGASTYA");
		m1.put(2,"NAKSHATRA");
		m1.put(3, "Shivada");
	Iterator<Map.Entry<Integer, String>> m2=m1.entrySet().iterator();
	while(m2.hasNext())
	{
		System.out.println(m2.next());
	
	
	}
}
}