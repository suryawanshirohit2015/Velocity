package ClassMethod;

public class nonstatic {
	
	public static void main(String[] args) {
		
		nonstatic x = new nonstatic();
		
		x.M3();
	}
     
	public void M3() {  //non static method
	
	System.out.println("non static started");
}}

