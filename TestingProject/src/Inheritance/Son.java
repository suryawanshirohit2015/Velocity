package Inheritance;

public class Son extends Father {   //  inheritance operation
	
	public void bike() {
		
		System.out.println("bike");
	}
	public static void main(String[] args) {
		
		Son s = new Son();
		
		s.bike();
		s.money();
		s.car();
		s.home();
		
	}
	
	
	

}
