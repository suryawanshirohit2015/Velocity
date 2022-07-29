package ClassMethod;

public class CallSample1 {   //regular method call from different class
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		SampleStatic1.M1();
		SampleStatic1.M2();
		
		System.out.println("Main method ended");
		
	}

}
