package A35_Tasks_Inheritance.Task2;

public class Square extends Shape {
	
	double sideA;
	
	public Square(double sideA) {		
		
		this.name = "Square";
		this.sideA = sideA;
		
	}
	
	public double area() {	
		
		return this.sideA * this.sideA;
		
	}
	
	public double perimeter() {	
		
		return 4 * this.sideA;		
	}
}
