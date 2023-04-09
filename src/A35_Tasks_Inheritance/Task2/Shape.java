package A35_Tasks_Inheritance.Task2;

public class Shape {
	
	String name;
	
	public Shape () {	
		
	}
	
	public double area() {	
		
		return 0.0;
		
	}
	
	public double perimeter() {	
		
		return 0.0;		
	}
	
	public String toString() {
		
		return "Shape :" + this.name + "\n"+
				"\tArea :" + this.area() + "\n"+
				"\tPerimeter :" + this.perimeter();
	}

}
