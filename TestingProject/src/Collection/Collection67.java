package Collection;

public class Collection67 <T>{
	
	int a;
	T b ;
	
	public static void main(String[] args) {
		
		Collection67 c = new Collection67();
		c.a=45;
		c.b=45;		
		System.out.println(c.b);
		c.b="Velocity";
		System.out.println(c.b);
		
		Collection67 e = new Collection67();
		e.b = 56789;
	
	}
}
