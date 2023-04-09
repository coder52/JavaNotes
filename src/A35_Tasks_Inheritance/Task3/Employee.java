package A35_Tasks_Inheritance.Task3;

public class Employee extends Person {
	
	private double salary;
	private School school;
	
	public void setSalary(Double salary) {
		
		this.salary = salary;
		
	}
	
	public double getSalary() {
		
		return this.salary;
		
	}
	
	public void setSchool(School school) {
		
		this.school = school;
		
	}
	
	public School getSchool() {
		
		return this.school;
		
	}
	
	public String toString() {
		return super.toString() +
				"\nSalary :" + this.getSalary() 
				//+ school.toString()
				;
		
	}

}
