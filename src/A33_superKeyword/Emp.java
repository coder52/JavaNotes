package A33_superKeyword;

public class Emp extends Person{

	float salary;
	float nod;
	
	Emp(int id, String name, float salary){
		
		super(id,name);		//reusing parent constructor  
		this.salary=salary;
		this.nod = super.id * 0.23f;	// reusing parent field 
		
	} 
	
	public void info() {
		
		String infoSuper = super.toString();	// reusing parent method
		
		System.out.println(infoSuper + " " + salary + " " + nod);   
	}
	
	void display(){
		// as you see we can use super or this keywords for awoke to super class
		  // attributes because we define in child class constructor.
		System.out.println(super.id + " " + this.name + " " + salary);
		
	} 
	
}  
	
	

