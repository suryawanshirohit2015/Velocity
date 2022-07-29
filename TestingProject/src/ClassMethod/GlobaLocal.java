package ClassMethod;

public class GlobaLocal {
	
	int a=90; //global variable
	
	public void demo() {
		
		int b=80;     //local variable
			
		System.out.println(a);
		System.out.println(b);
	}
	public void demo1() {
	
		int c=50;   //local variable
		
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) {
		GlobaLocal x = new GlobaLocal();
		x.demo();
		x.demo1();
	}

	

}
