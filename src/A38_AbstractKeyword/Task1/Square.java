package A38_AbstractKeyword.Task1;

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
