package Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Collection5 {
	 public static void main(String[] args) {
	           Hashtable <Integer,String> map = new	Hashtable();
	           
	           map.put(34, null);
	           map.put(45, "Mumbai");
	           map.put(45, "Testing");
	           map.put(21, "hghghg");
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
