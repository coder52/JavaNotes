package A35_Tasks_Inheritance.Task4;

public class Tiger extends Cat {
	
	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String noise()	{
		
		return "Mostly silent, but produce noise when attacks.";
		
	}
	
	@Override
	public String sleep()	{
		
		return "At night, on the tree.";
		
	}
}
