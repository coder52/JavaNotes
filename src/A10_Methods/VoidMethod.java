package A10_Methods;

public class VoidMethod {
	
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		sum (num1,num2);
		
		int[][] arr2D = {{1,2},{3,4}};
		
		sum2D(arr2D);
		
	}
	
	public static void sum(int a, int b) {
		
		System.out.println(a + " + " + b + " = " + (a+b));	
		
	}
	
	public static void sum2D(int[][] arr2D) {
		
		int total=0;
				
		for (int i=0; i<arr2D.length;i++) {
			for(int j=0; j<arr2D[0].length;j++) {
				
				total += arr2D[i][j];
				
			}
		}
		System.out.println("Total of elements of array is " + total + ".");	
		
	}


}
