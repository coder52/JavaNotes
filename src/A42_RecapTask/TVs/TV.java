package A42_RecapTask.TVs;

import A42_RecapTask.abstractions.AbstractDevice;

public abstract class TV extends AbstractDevice{
	
	private double diagonal;
    private String os;  //operation system
    
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
    
    

}
