package AbstractMethod;

public class Testdefault1 implements Velo1{  //new implementation class one
	
	public void mart() {//completed this method from interface
		System.out.println("All shops open");
	}
	
	public static void main(String[] args) {
		Testdefault x =new Testdefault(); //object of implementation class
		Testdefault1 y = new Testdefault1();//object of implementation class
		
		x.Dmart();//default method of interface is call with imple. class object
		x.mart();  //override method of interface
		
		y.Dmart();  //default method of interface is call with imple. class object
		y.mart();  //override method of interface
		
	}
	

}
