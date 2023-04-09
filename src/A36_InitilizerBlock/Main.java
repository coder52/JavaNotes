package A36_InitilizerBlock;

public class Main {

	// Birden fazla initilizer block olabilir.
	// instance initilizer blok icinde ki kodu, compiler, o sinifin constructorunun ilk satirina kopyalar
	// boylece sanki initilizer blok once calismis gibi anlasilir. Ama oyle degil konstructor calisir once.
	
	public static void main(String[] args) {
		
		InitilizerBlock iBlock = new InitilizerBlock();
		
		iBlock.name = "name";
		
	}
	
}
