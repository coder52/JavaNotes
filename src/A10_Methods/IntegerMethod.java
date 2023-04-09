package A10_Methods;

public class IntegerMethod {
	
	public static void main(String[] args) {
		
		int[][] arr2D = {{3,4,5,6},
						 {7,3,6,4},
						 {1,5,7,9}};
		
		int sum = total(arr2D);
		
		System.out.println(sum);
	}
	
	public static int total(int[][] arr2D) {
		
		int total=0;
		// First
		for (int i=0; i<arr2D.length;i++) {
			for(int j=0; j<arr2D[0].length;j++) {

				total += arr2D[i][j];

			}
		}
		// Second
//		for (int[] arr:arr2D) {
//			for (int i:arr) {
//				total+=i;
//			}
//		}
		
		return total;
	}
}
