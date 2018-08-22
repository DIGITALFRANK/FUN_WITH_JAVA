package Maps;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
//		Map<String, String> m1 = new HashMap<String,String>();
//		m1.put("Zara", "8");
//		m1.put("Mahnaz", "8");
//		m1.put("Ayan", "12");
//		m1.put("Daisy", "14");
//		
//		System.out.println(m1);
//		System.out.println(m1.entrySet());
//		System.out.println(m1.get("Zara"));
		
		
//		for (Map.Entry<String, String> i : m1.entrySet()) {
//			System.out.println("Key : "+i.getKey()+" | Value : "+i.getValue());
//		}
//		System.out.println();
//		System.out.println(" Map Elements");
//		System.out.println("\t"+m1);
		
//		System.out.println();
		
		TreeMap<String, String> m2 = new TreeMap<String,String>();
		m2.put("Zara", "8");
		m2.put("Mahnaz", "31");
		m2.put("Ayan", "12");
		m2.put("Daisy", "14");
		
		for (Map.Entry<String, String> entry : m2.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" | Value : "+entry.getValue());
		}
		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t"+m2);
	}

}


