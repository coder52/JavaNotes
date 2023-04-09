package A09_Arrays;

import java.util.Arrays;

public class Arrays2D {
	
	public static void main(String[] args) {
		
		// Array bos olarak tanimlanirsa boyutlardan en azindan ilki yazilmalidir		
		String[][] array2D = new String[3][3];
		
		// Ama isterseniz boylede tanimlayabilirsiniz.		
		String[][] strArray2D = {
						{"asd", "dfr"},
						{"asdasd", "asdfe", "hgfdk"},
						{"safdfght","gfdg", "dgny"}
		};
		
		System.out.println(strArray2D[0][0].length()); // stringin lengthi .length() ile
		System.out.println(strArray2D[0].length);		// arrayin lengthi .length  ile parantezsiz.
		
		System.out.println(Arrays.toString(strArray2D[1]));
		System.out.println(strArray2D[1][0]);
		
		 
	}
		
		
	

}
