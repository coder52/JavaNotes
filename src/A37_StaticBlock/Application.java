package A37_StaticBlock;

public class Application {
	
	static int  x;
	
	static {
		x = 10;
		System.out.println("Static block executes before constroctur.");
	}
	
	public Application(){
		
		System.out.println("This is constructor block.");	
		
	}

}
