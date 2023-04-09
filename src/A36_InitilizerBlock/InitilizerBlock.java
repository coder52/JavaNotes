package A36_InitilizerBlock;

public class InitilizerBlock {
	
	String name;
	
	{
		name = "Mickhel";
		
		System.out.println(" Initilize block exucutes first.");
	}
	
	public InitilizerBlock() {
		
		System.out.println(" Constructer block exucutes after initilizer.");
		
	}

}
