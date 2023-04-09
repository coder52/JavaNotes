package A31_Inheritance;

public class Ex1 {
	
	public static void main(String [] args) {
		
		SuperClass superClass = new SuperClass();		
		superClass.name = "I'm super";
		
		System.out.println(superClass);
		
		SubClass subClass = new SubClass();
		subClass.name = "I'm sub.";
		System.out.println(subClass);
		
		
	}

}
