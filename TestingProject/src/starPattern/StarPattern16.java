package starPattern;

public class StarPattern16 {
	
	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			if(i==1) {
				System.out.print("    *");
			}
			else if(i==2) {
				System.out.print("   **");
			}
			else if(i==3) {
				System.out.print("  * *");
			}else if(i==4) {
				System.out.print(" *  *");
			}
			
			else {
				System.out.print("*****");
			}
			System.out.println();
			
	
		}
	}

}
