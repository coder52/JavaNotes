package A38_AbstractKeyword.Task1;

public class Rectangle extends Square {
	
	double sideB;	
	
	public Rectangle(double sideA, double sideB ) {
		
		super(sideA);
		this.name = "Rectangele";
		this.sideB = sideB;
		
	}
	
	public double area() {	
		
		return this.sideA * this.sideB;
		
	}
	
	public double perimeter() {	
		
		return 2 * this.sideA + 2 * this.sideB;		
	}

}
