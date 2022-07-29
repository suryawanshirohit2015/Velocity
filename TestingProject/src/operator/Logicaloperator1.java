package operator;

public class Logicaloperator1 {

	
	public static void main(String[] args) {
		
		//&& operator (And)
		
		System.out.println((10>5) && (12>3));  //true
		System.out.println((10>5) && (12<3));   //false
		
		
		// ||operator(or)
		
		System.out.println((10>5) || (12>3)); //true
		
		System.out.println((10>5) ||  (12<3) ); // true
		
		System.out.println((10<5) || (12<3));  // false
		
		// !operator (not)
		
		System.out.println(!(3==5)); //true
		
		System.out.println(!(5>3)); //false
		
	}
}
