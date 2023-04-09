package A42_RecapTask.utils;

public enum Career {
	
	T_MOBILE("T Mobile"), VERIZON("Verizon"), 
	AT_T("AT&T"), SPRING("Spring"), UNLOCKED("Unlocked");

	private String name;
	
	Career(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
