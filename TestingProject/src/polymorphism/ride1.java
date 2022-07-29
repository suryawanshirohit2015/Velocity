package polymorphism;

public class ride1 extends ride {    //super class method is hide
	
	public static void M1() {
		System.out.println(" M1 is not running");    //change implementation
			
		}
	
	public static void main(String[] args) {
		
	//	ride1 x= new ride1();
		ride1.M1();
	}
	
	
	
	

}
