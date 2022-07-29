package String;

public class reverseString {
	
	public static void main(String[] args) {
		
		String a = "Velocity";
		String rev =""; //yticolev
		
		//System.out.println(a.indexOf("C"));
		
		for(int  i =a.length()-1;i>=0;i--) {
			rev =rev +a.charAt(i);
			
		}	
		System.out.println(rev);
		
		
		
	}

}
