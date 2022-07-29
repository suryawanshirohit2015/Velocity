package Collection;

import java.util.ArrayList;

public class Collection2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <Integer>();
		
		list.add(3214);
		list.add(4356);
		list.add(3489);
		list.add(23456);
		
		int size = list.size();
		System.out.println("Size="+size);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============================");
	    list.remove(2);
	    
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	  
		
	}

}
