package A42_RecapTask.Tablets;

import A42_RecapTask.abstractions.AbstractDevice;

public abstract class Tablet extends AbstractDevice{
	
	private boolean pen;// hasPen
	
	public boolean hasPen() {
		return pen;
	}
	
	public void setPen(boolean pen) {
		this.pen = pen;
	}

}
