package A42_RecapTask.utils;

public enum DisplayType {
	
	FHD("FullHD"), RETINA("Retina"), FOURK("4K");
	
	public String name;
	
	DisplayType(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	

}
