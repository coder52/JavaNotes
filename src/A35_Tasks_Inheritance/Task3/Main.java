package A35_Tasks_Inheritance.Task3;

public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Ahmet");
		person.setAddress("416 Elm Str. Neworlians");
		
		System.out.println(person);
		
		Student student = new Student();
		student.setName("Ali");
		student.setAddress("Bahnhofstr. 10, Honkong");
		student.setFee(300.00);
		
		System.out.println(student);
		
		Employee employee = new Employee();
		employee.setName("Mehmet");
		employee.setAddress("Cevdet sk. 30, Tekirdag");
		employee.setSalary(2500.00);
		
		System.out.println(employee);
		
		School school = new School("KTL", 30);
		school.registerStudent(student);
		school.registerEmploye(employee);
		System.out.println(school);
		
	}

}
