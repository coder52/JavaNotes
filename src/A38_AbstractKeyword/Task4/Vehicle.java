package A38_AbstractKeyword.Task4;

public abstract class Vehicle {
	
	String model;


	public Vehicle(String model){

		this.model = model;

	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"model='" + model + '\'' +
				'}';
	}
}
