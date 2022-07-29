package Constructor;

public class Test {
	
       int a;
       int b;
       int M;
       String Name ;
       String Velocity;
       
       Test(){
    	   a=50;
    	   b=30;
   	}
  
       Test(int c ,int d){
    	   a=c;
    	   b=d;
       }
       Test(int c ,int d, int i){
    	   a=c ;
    	   b=d;
    	   M=i;
    	   System.out.println(a);
       }
       Test(String Name,String Velocity){
       }
       public void addition() {
    	   System.out.println(a+b+M);
       }
       public void work() {
    	   System.out.println("Name");
    	   System.out.println("Velocity");
       }
       public static void main(String[] args) {
		Test T = new Test();
			T.addition();
			T.work();
			
			Test T1 =new Test(100,500);
			T1.addition();
			
			
	}
       }
       
