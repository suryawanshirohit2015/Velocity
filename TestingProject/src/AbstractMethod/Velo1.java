package AbstractMethod;

public interface Velo1 {
	
	void mart(); //incomplete method  of interface
	
	default void Dmart() {  // Default method of interface  
		System.out.println("Shopping ");
	}

}
