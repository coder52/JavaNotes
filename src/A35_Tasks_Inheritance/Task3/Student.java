package A35_Tasks_Inheritance.Task3;

public class Student extends Person {
	
	private double fee;
	private School school;	
	
	public void setFee(Double fee) {
		
		this.fee = fee;
		
	}
	
	public double getFee() {
		
		return this.fee;
		
	}
	
	public void setSchool(School school) {
		
		this.school = school;
		
	}
	
	public School getSchool() {
		
		return this.school;
		
	}
	
	public String toString() {
		return super.toString() +
				"\nFee :" + this.getFee() 
				//+ school.toString()
				;
		
	}

}
