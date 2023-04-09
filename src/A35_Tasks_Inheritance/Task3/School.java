package A35_Tasks_Inheritance.Task3;

import java.util.ArrayList;

public class School {
	
	private String name;
	private int	maxStudent;
	private ArrayList<Student> students;
	private ArrayList<Employee> employees;
	
	public School(String name, int maxStudent) {
		
		this.name = name;
		this.maxStudent = maxStudent;
		students = new ArrayList<Student>();
		employees = new ArrayList<Employee>();
				
	}
	
	public void registerStudent(Student student){
		
		if(students.size()==maxStudent) {
			
			throw new RuntimeException("Student size exceet expectation!!!");
			
		}
		
		students.add(student);
		
	}
	
	public void registerEmploye(Employee employee){
		
		employees.add(employee);
		
	}
	
	public String toString() {
		
		return "Name: " + this.name +
				"\nMax Student :" + this.maxStudent +
				"\nNumber of Students :" + this.students.size() +
				"\nNumber of Employee :" + this.employees.size() ;
				
	}
	

}
