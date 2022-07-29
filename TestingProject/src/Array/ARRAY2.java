package Array;

public class ARRAY2 {
	
	public static void main(String[] args) {
		
		String ar[] =new String[5];  //array declaration
			
			ar[0] ="JAVA"; 
			ar[1] ="AUTOMATION"; 
			ar[2] ="MANUAL"; 
			ar[3] ="API"; 
			ar[4] ="SELENIUM";
		//	ar[5] ="DEFAULt";        //Array out of bound exception when we increase limit
			
			System.out.println(ar[0]);  //with the help of index array call
		
			System.out.println("----------print All  the informaton of array");
			
			for(int i=0;i<=4;i++) {    //array calling
				
				System.out.println(ar[i]);
				
		}
	}

}
