package A35_Tasks_Inheritance.Task2;

public class Rectangle extends Square{
	
	double sideB;	
	
	public Rectangle(double sideA, double sideB ) {
		
		super(sideA);
		this.name = "Rectangle";
		this.sideB = sideB;
		
	}
	
	public double area() {	
		
		return this.sideA * this.sideB;
		
	}
	
	public double perimeter() {	
		
		return 2 * this.sideA + 2 * this.sideB;		
	}

}
