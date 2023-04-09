package A38_AbstractKeyword.Task1;

public class Main {
	
	public static void main(String[] args) {
		
		Shape circle = new Circle(2.1);
		System.out.println(circle);
		
		Shape square = new Square(4);
		System.out.println(square);
		
		Shape shape = new Rectangle(3,5);
		System.out.println(shape);

		shape = new Circle(3.5);
		System.out.println(shape);

		
		
	}

}
