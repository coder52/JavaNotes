package A13_WrapperClass;

public class WrapperClass {
	
	// we can convert primitive to reference or Wrapper Class
	// yaninda ref yazanlar artik bir class oldu (Wrapper Class) istersen adinin yanina nokta koyarak metodlarini gorebilirsin
	// normal primitive sayi gibi islem de yapilabiliyor
	// ama primitiv sayilar bir class degildir, metodlari yoktur
	

	public static void main(String[] args) {
		
        byte bytePrimitive = 0;
        Byte byteObject = new Byte(bytePrimitive);
        Byte byteObject2 = bytePrimitive;
        
        short shortPrimitive = 0;
        Short shortObject = new Short(shortPrimitive);
        Short shortObject2 = shortPrimitive;
        
        int integerPrimitive = 0;
        Integer objectInteger = new Integer(integerPrimitive);        
        
        long longNum= 0L;
        Long refLong = new Long(longNum);
        
        float flt = 0.0f;
        Float refFloat = new Float(flt);       
        
        double dbl = 0.0d;
        Double refDouble = new Double(dbl);
        
        char ch = 'A';
        Character refChar = new Character(ch);
        
        boolean booleanPrimitive = false;
        Boolean refBool = new Boolean(booleanPrimitive);
        Boolean refBool2 = booleanPrimitive;
        Boolean refBool3 = Boolean.FALSE;
        
        // String her iki durumda da objecttir.
        String st= "Text";   // String str = new String("Text");
        
        System.out.println(objectInteger);
		
	}
}
