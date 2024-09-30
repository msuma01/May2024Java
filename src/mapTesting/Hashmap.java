package mapTesting;

import java.util.HashMap;


//HashMap is a class implements Map interface and it inherits Abstract Map(Extends)
		//it contains unique elements
		// it stores the values- key- value pair
		// it may have one  null key and multiple null values.
		// it maintains no order
		// Hash Map is non synchronized --- not thread safe
		// Fail Fast condition
		// simultaneously if any thread modifies a map by adding or removing, 
		// it will give concurrent Modification Exception

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Chrome", 456);
		m1.put("Firefox", 687);
		m1.put("Edge", 3728);
		
		System.out.println(m1);
		System.out.println(m1.get("Chrome"));
		System.out.println(m1.size());
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(23, "Selenium");
		h.put(24,"QTP");
		h.put(25,"Test Complete");
		//remove
		h.remove(25);
		h.get(23); //get the value fo the corresponding key
		System.out.println(h.get(25));
		System.out.println(h.get(23));
		System.out.println(h.size());
		System.out.println(h.get(26));
	}

}
