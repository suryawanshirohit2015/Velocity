package Inheritance;

public class Super2 extends Super1 {
	
	int a=110;  //global variable
	
	public void demo() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Super2 s = new Super2();
		
		s.test();
		s.demo();
	//	System.out.println(this.a);
	}
	

}
