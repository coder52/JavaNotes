package A42_RecapTask;

public class MoneyNotEnoughExeption extends RuntimeException {
	
	public MoneyNotEnoughExeption(String text) {
		
		super (">>> " + text + " <<<");		
	}

}
