package A11_MethodsOverloading;

public class MethodOverloadingDataTypes {
	
	public static void main(String[] args) {
		
		printn(4);
		printn(4.4f);
		printn(true);
		printn((byte) 5);
		
	}
	
	
	public static void printn(int n) {
		
		System.out.println("you have integer " + n);
		
	}
	
	public static void printn(float n) {
		
		System.out.println("you have float " + n);
		
	}
	
	public static void printn(byte n) {
		
		System.out.println("you have byte " + n);
		
	}
	
	public static void printn(boolean n) {
		
		System.out.println("you have boolean " + n);
		
	}

}
