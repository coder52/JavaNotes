package A42_RecapTask.abstractions;

import A42_RecapTask.Phones.Phone;
import A42_RecapTask.TVs.TV;
import A42_RecapTask.Tablets.Tablet;
import A42_RecapTask.utils.Condition;


public abstract class AbstractDevice implements Device {
	
	private String name;
	private double price;
	private String model;
	private Condition condition;
	
	public String toString() {
		
		String info = "\n---" + getClass().getSimpleName() + "---" +
		"\nname:" + name +
		"\nprice:" + price +
		"\nmodel:" + model +
		"\ncondition:" + condition;	
		
		
		if(this instanceof Phone) {
			
			Phone phone = (Phone) this;
			
			info += "\ncareer:" + phone.getCareer().getName();	
			
		} else if (this instanceof Tablet) {
			
			Tablet tablet = (Tablet) this;
			
			info += "\npen:" + (tablet.hasPen() ? "included" : "not included");
						
		} else if (this instanceof TV) {
			
			TV tv = (TV) this;
			
			info += "\nDiagonal:" + tv.getDiagonal();
			info += "\nOS:" + tv.getOs();
			
		} 
		// Alltta kalan kisim yerine child classda (abstract laptop) nasil yapilacagini gosterdik oraya bakabilirsin
//			else if (this instanceof Laptop) {
//			
//			Laptop laptop =  (Laptop) this;
//			
//			info += "\nRAM:" + laptop.getRAM();
//			info += "\nCPU:" + laptop.getProcessor();
//			info += "\nDisplay Type:" + laptop.getDisplayType();
//		}
		
		return info;
		
	}
	
	
	@Override
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	
	

}
