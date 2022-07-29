package Array;

import java.util.Arrays;

public class DemoA {
	
	public static void main(String[] args) {
		int ar[]= {10,60,30,40,20} ; //10,20,30,40,60
        System.out.println("---------original info from array-------");
        
        for (int i=0;i<=ar.length-1;i++) {
        	System.out.println(ar[i]);
        }
        Arrays.sort(ar);
        System.out.println("------------print array in ascending order---------");
        for(int i=0;i<=ar.length-1;i++) {
        	System.out.println(ar[i]);
        }
        System.out.println("------------print array in descending order--------");
        for(int i=ar.length-1;i>=0;i--) {
        	System.out.println(ar[i]);
        }
        		
	}
}
