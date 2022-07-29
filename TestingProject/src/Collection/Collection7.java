package Collection;

public class Collection7<T, L> {
	
	
		 
		 int a;
		 T b ;
		 
		 //return type = (T) generic , L =Argument
		 
		 T Demo(L d) {
			 System.out.println(d);
			 return b;
		 }
		 
		 public static void main(String[] args) {
			
			Collection7 e = new Collection7();
			e.Demo("Velocity");
			e.Demo(34);
		}
		 
		
	

}
