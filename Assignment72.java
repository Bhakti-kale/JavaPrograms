package assignments;

import java.util.HashMap;
import java.util.Map;

//WAP using Map to store student roll numbers and their names then perform actions: i)
//Check if specific roll no and name exist in map & print if exists
public class Assignment72 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(1, "Bhakti");
		m1.put(2, "Nagesh");
		m1.put(3, "Dnyanada");

		if (m1.containsKey(2) && m1.containsValue("Nagesh")) {

			System.out.println("2=Nagesh");

		}
	}
}
