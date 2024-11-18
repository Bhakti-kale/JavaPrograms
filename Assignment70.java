package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//WAP using the Map interface and iterate over its entries using for loop
public class Assignment70 
{
	public static void main(String[] args)
	{

		Map<String,Integer> m1=new HashMap<String,Integer>();
		//employee name and their salary
		
		m1.put("Rashmi", 8532);
		m1.put("Meenu", 9857);
		m1.put("Blake", 7485);
		m1.put("Shantanu", 8541);
		m1.put("Shekhar", 7496);
		//System.out.println(m1.keySet());
		
			for(String s1:			m1.keySet())
			{
				System.out.println(s1);
			}
		
		//System.out.println(m1.values());
		
			for(Integer i1:					m1.values())
			{
				System.out.println(i1);
			}
		
			for(Entry<String,Integer>	i2:				m1.entrySet())
			{
				System.out.println(i2);
			}
			
			Iterator <Entry <String, Integer>> i3=			m1.entrySet().iterator();
			System.out.println("Using Iterator");
			while(i3.hasNext())
			{
				System.out.println(i3.next());
			}
			
			
		
	}
}
