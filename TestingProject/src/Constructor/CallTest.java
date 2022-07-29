package Constructor;

public class CallTest {
	
	public static void main(String[] args) {
		
		Test T = new Test();
			T.work();
		    T.addition();
		System.out.println();
		
		Test T1 =new Test(100,200);
		T1.addition();
		System.out.println();
		
		Test T2 =new Test(200,300);
		T2.addition();
		
}}