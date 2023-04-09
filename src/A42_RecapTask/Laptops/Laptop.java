package A42_RecapTask.Laptops;

import A42_RecapTask.abstractions.AbstractDevice;
import A42_RecapTask.utils.DisplayType;
import A42_RecapTask.utils.Processor;

public abstract class Laptop extends AbstractDevice {
	
	String RAM;
	
	Processor cpu;
	
	DisplayType displayType;
	
	public DisplayType getDisplayType() {
		return displayType; 
	}
	
	public void setDisplayType(DisplayType displayType) {
		this.displayType = displayType;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String ram) {
		RAM = ram;
	}

	public Processor getProcessor() {
		return cpu;
	}

	public void setProcessor(Processor cpu) {
		this.cpu = cpu;
	}
	
	@Override
    public String toString() {
        return super.toString()+
        		"\nRAM:" + this.getRAM() +
				"\nCPU:" + this.getProcessor().getName() +
				"\nDisplay Type:" + this.getDisplayType().getName();
    }
	

}
