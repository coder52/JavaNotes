package A35_Tasks_Inheritance.Task2;

public class Circle extends Shape {
	
	final float PI = 3.14f;
	double radius;
	
	public Circle (double radius) {		
		
		this.name = "Circle";
		this.radius = radius;		
		
	}
	
	public double area() {
		
		return this.PI * this.radius;
		
	}
	
	public double perimeter() {
		
		return 2 * this.PI * this.radius;
	}	
	
}
