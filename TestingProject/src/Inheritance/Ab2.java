package Inheritance;

public class Ab2 extends Ab {    //concrete class
	
	public void show() {      //complete method declare body
		System.out.println("Running show method");
	}
	
	public void blank() {      //complete method declare body
		System.out.println("Running blank method");
	}
	
	public static void main(String[] args) {
		Ab2 a = new Ab2();
		
		a.show();
		a.blank();
		a.display();
		
			}

}
