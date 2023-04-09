package A42_RecapTask.abstractions;


public interface Device {
	
	
	 //2.way
//  default double getPrice() {
//      AbstractDevice absDev = (AbstractDevice) this;
//      return absDev.getPrice();
//  }	
	
	String abc = "abc";
	public abstract double getPrice();

	public abstract String getName();

}
