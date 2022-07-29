package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection4 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap();
	   
		map.put(34, "Velocity");
		map.put(45, null);
		map.put(45, "Testing");
		map.put(21, null);
		map.put(null, "Velocity");
		map.put(67, "Pune");
		
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Key "+ e.getKey() + "value " + e.getValue());
		}
		System.out.println("**********************");
	map.put(32," system");
	for(Entry<Integer, String> e : map.entrySet()) {
		System.out.println("Key " + e.getKey() + " value " + e.getValue());
		
	}
	
	
	
	}

}
