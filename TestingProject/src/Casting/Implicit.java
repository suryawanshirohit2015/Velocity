package Casting;

public class Implicit {

	public static void main(String[] args) {
		
		byte a= 67;              //memory size 1 byte
		System.out.println(a);
	
	   int b =a;                 //memory size 4 byte 
	   System.out.println(b);
	   
	   double c=a;             //memory size 8 byte
	   System.out.println(c);
	}
		
}
