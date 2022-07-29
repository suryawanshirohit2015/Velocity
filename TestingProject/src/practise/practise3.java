package practise;

public class practise3 {
	
	public static void main(String[] args) {
		
		int space=0;
		int star=4;
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=space;j++) {
			System.out.print(" ");
		}
			for(int j=0;j<=star;j++) {
				System.out.print("*");
			}
			if(i<=4) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
		}
			System.out.println();
		
	}
	}
}
