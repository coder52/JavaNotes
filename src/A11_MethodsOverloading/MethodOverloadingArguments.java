package A11_MethodsOverloading;

public class MethodOverloadingArguments {
	
	/*
	There are three ways to overload the method in java

	1. By changing number of arguments
	2. By changing the data type
	3. By changing the order of parameters of method.
	
	*/
	public static void main(String[] args) {
		
		
		int num1=23;
		int num2=45;
		int num3=9;
		
		System.out.println(sum(num1,num2));
		System.out.println(sum(num1,num2, num3));
		System.out.println(sum(new int[] {1,4,5,8,9,5,7,8,9,5,3,5,7}));
		// Varargs method
		System.out.println(sum(1,4,5,8,9,5,7,8,9,5,3,5,7));

	}
	
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
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
//	public static int sum(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}

}
