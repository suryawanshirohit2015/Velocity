
package starPattern;

public class StarPattern14 {
	
	public static void main(String[] args) {
		
		  int star =9,space=0;
		     
		     for (int i=1;i<=4;i++) {
		    	 for(int j=1;j<=space;j++) {
		    		 
		    		System.out.print(" ");
		    	 }
		         for(int j=1;j<=star;j++) {
		        	 
		        	 System.out.print("*");
		        	 
		         }
		        System.out.println();
		         star=star-2;
		        space++;
		         

	}
		     int space2=4;
				int star2 =1;
				for(int i=1;i<=5;i++) {
					
					int j;
					
					for(j=1;j<=space2;j++) {
						                            //4<=3 false
						System.out.print(" ");
						
						
					}
					for (j= 1;j<=star2;j++) {       //2<=1 true
						System.out.print("*");
					}
					System.out.println();
					space2--;
					star2=star2+2;

}
}}