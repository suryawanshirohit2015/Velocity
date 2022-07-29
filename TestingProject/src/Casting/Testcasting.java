package Casting;

public class Testcasting {
	
	public static void main(String[] args) {
		
		Father f = new Son();      //up casting syantax
		f.money();
		f.car();
		
		
		Father d =new Father();
		d.car();
		d.money();
		
	}

}
