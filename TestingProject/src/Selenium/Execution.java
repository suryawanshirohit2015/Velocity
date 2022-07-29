package Selenium;

public class Execution {
	
	public static void main(String[] args) {
		
		Gamma g = new Gamma();
		
		Beta b =  g.memo();
		
		Alpha c = b.Demo();
		
		c.test();
		
		g.memo().Demo().test();
	}

}
