package A42_RecapTask.utils;

public enum Processor {
	
	INTEL("intel"), AMD("AMD"), XONE("X1"), XTWO("X2");
	
	public String name;
	
	Processor(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
