package A10_Methods;

public class BoolMethod {
	
	public static void main(String[] args) {
		
		String name = "James Bond";
		
		System.out.print(isChar(name));
		
	}
	
	public static boolean isChar(String str) {
		
		char ch = Character.toLowerCase(str.charAt(0));	// check first letter whether
		
		boolean isLetter = ch>='a' && ch<='z';
		return isLetter;	
		
	}

}
