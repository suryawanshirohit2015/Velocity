package Collection;

import java.util.ArrayList;

public class Collection1 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(345678);
		list.add("velocity");
		list.add('%');
		list.add(26.57f);
		
		int size = list.size();
		System.out.println("Size =" + size );
		
		for(int i=0;i<size;i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*******************");
		list.remove(2);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
	


}}