package A35_Tasks_Inheritance.Task4;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String noise()	{
		
		return "Not overriden.";
		
	}
	
	@Override
	public String eat()	{
		
		return "eats too much.";
		
	}
	
	@Override
	public String sleep()	{
		
		return "allways sleeping.";
		
	}
	
	
}
