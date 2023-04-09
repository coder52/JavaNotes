package A16_Collections;

import java.util.ArrayList;
import java.util.Collections;


public class JavaCollections {
	
	/*
	 * Collections.sort(intList);
	 * Collections.max(intList);
	 * Collections.min(intList);
	 * Collections.reverse(intList);
	 * Collections.fill(intList, 101);
	 * Collections.replaceAll(intList, 101, 404);
	 * Collections.addAll(strList, strArray);
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(3);
		intList.add(1);
		intList.add(2);
		intList.add(0);
		
		System.out.println(intList);		
		Collections.sort(intList);		
		System.out.println("sorted " + intList);
		
		Collections.swap(intList, 0,3);
		System.out.println("swap " + intList);
		
		int maxNum = Collections.max(intList);
		System.out.println(maxNum);
		
		int minNum = Collections.min(intList);
		System.out.println(minNum);
		
		Collections.reverse(intList);
		System.out.println(intList);
		
		Collections.fill(intList, 101);
		System.out.println(intList);
		
		Collections.replaceAll(intList, 101, 404);
		System.out.println(intList);

		String[] strArray = {"Ali", "Ahmet", "Mehmet", "Ali", "Hasan", "Suleyman", "Faruk", "Mehmet"};
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Sami");
		Collections.addAll(strList, strArray);
		System.out.println(strList);
		

	}

}
