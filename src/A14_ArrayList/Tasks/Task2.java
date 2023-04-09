package A14_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
	
	public static void main(String[] args){
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		Random rand = new Random(10);
		
		int size = 10;		
		for(int i=0; i<size; i++) {		
			
			intList.add(rand.nextInt(100));
			
		}
		
		System.out.println(intList);
		
	}

}
