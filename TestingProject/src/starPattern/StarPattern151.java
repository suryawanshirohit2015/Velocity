package starPattern;

public class StarPattern151 {
	
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
			for(int a=1;a<=i;a++) {
				if (a==1 || a==i || i ==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
