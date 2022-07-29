package Inheritance;

public class Testm  implements multiple,multiple1{
	
	public void M1() {
		System.out.println("Running M1 method");
	}
	public void M2() {
		System.out.println("Running M2 method");
	}
	public void M3() {
		System.out.println("Running M3 method ");
	}
	public void M4() {
		System.out.println("Running M4 method ");
	}
	public static void main(String[] args) {
		Testm t = new Testm();
		
		t.M1();
		t.M2();
		t.M3();
		t.M4();

		}
	
	

}
