package A12_Varargs;

public class Varargs {
	
public static void main(String[] args) {
		
		
		int num1=23;
		int num2=45;
		int num3=9;
		
		System.out.println(sum(num1,num2));
		System.out.println(sum(num1,num2, num3));
		
		System.out.println(sum(new int[] {1,4,5,8,9,5,7,8,9,5,3,5,7}));
		
		System.out.println(sum(1,4,5,8,9,5,7,8,9,5,3,5,7));
		System.out.println(sum("abc", 1,4,5,8,9,5,7,8,9,5,3,5,7));

	}	
	
	/*
	public static int sum(int[] numbers) {
		
		int sum = 0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}
	*/
	
	public static int sum(int... numbers) {
		
		int sum = 0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}
	// eger varargsdan baska arguman varsa varargs en sonda yazilmali
	// dikkat numbers uzerinde yaptigimiz islemler bir aray uzerinde yapilan islemler gibidir
	public static int sum(String str, int... numbers) {
		
		int sum = 0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}

}
