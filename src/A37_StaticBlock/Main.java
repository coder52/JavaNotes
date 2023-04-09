package A37_StaticBlock;

public class Main {
	
	public static void main(String[] args ) {
		
		Application app1 = new Application();
		System.out.println(app1.x);
		
		Application app2 = new Application();
		System.out.println("Static block executes only one times.");
		
	}

}
