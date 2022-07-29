package Casting;

public class explicit {
	public static void main(String[] args) {
		
		double a =  87.65;   //memory size 8 byte
		System.out.println(a);
		
		int b= ( int) a;     //memory size 4 byte    //casting operator
		System.out.println(b);
		
		byte c = (byte)b;    //memory size 1 byte
		System.out.println(c);
		
	}

}
