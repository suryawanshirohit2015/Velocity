package Constructor;

public class testSample {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Sample x = new Sample();//USER DEFINED constructor here Sample(); is a constructor
		
		x.M1();//calling non static method from sample class from creating object
		
		System.out.println("Main method ended");
	}
	
	

}
