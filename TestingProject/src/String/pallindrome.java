package String;

public class pallindrome {
	
	public static void main(String[] args) {
		
		String a ="MADAM";
		String rev =""; //MADAM
		
		for(int i=a.length()-1;i>=0;i--) {
			rev = rev+a.charAt(i);
		}
		 System.out.println(rev);
		 
		 if(a.equals(rev)) {
			 System.out.println("String is Pallindromme.");
		 }
			 
			 else {
				 System.out.println("String is not Pallindrome");
			 }
		 }
				
				
	}


