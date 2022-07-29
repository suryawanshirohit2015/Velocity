package AbstractMethod;

public class Test implements Velocity { //interface property are implemented
	
	public void Q1() {  //method from interface completed here
	System.out.println("Q1 is running");	
	
	}
	
	public void Q2() { //  method from interface completed here
		System.out.println("Q2 is running");
	}
	
	public static void main(String[] args) {
		Test x = new Test();  //implementation class object created
		
		x.Q1();
		x.Q2();
		Velocity.M();//static method of interface always cal with interface name only
		
	}

}
