package A38_AbstractKeyword.Task1;

public abstract class Shape {
	
	String name;

	public abstract double area();
	
	public abstract double perimeter();
	
	public String toString() {
		
		return "Shape :" + this.name + "\n"+
				"\tArea :" + this.area() + "\n"+
				"\tPerimeter :" + this.perimeter();
	}

}
