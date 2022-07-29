package Casting;

public class TestUpcasting {
	
	public static void main(String[] args) {
		
		System.out.println("******Super class object******");
		
		Upcasting x = new Upcasting();
		x.demo();
		x.set();
		x.Statictest();
		
		System.out.println("****Sub class object****");
		
		
		Upcasting1 t= new Upcasting1();
		t.demo();
		t.set();
		t.sub();
		t.Statictest();   //non override
		
	System.out.println("****up casting****");
		
		Upcasting z =new Upcasting1();
		
		z.demo();
		z.set();
		z.Statictest();
		
		Upcasting1 sub = (Upcasting1) new Upcasting();   //Down casting
		
		sub.demo();
		sub.set();
		
		
		
		
		
		
	}

	
}
