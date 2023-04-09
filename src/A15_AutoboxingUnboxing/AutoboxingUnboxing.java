package A15_AutoboxingUnboxing;

import java.util.ArrayList;

public class AutoboxingUnboxing {
	
	// Autoboxing: primitive variabllarin (int, long, ...) Object variabllara (Integer, Long, ... ) otomatik degismesi
	// Unboxing:  Object variabllarin primitive variabllara (Integer, Long, ... ) otomatik degismesi
	// Bunlar eskiden otomatik degilmis simdi biz farkina bile varmiyoruz. 
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		int a=10;
		intList.add(a); //burada iste Autoboxing yapiyoruz int i direk Integer listesine baska nasil atardik.
						// Normalde . dan sonra ki aciklamalara baksan orada Integer bekliyor ama biz rahatlikla int
					          	//veriyoruz
		
		
		Integer intObj = intList.get(0); //Bu zaten normal birsey ama...
		
		int num = intList.get(0);  //iste burda da Unboxing yaptik ta haberimiz yok.

		
	}

}
