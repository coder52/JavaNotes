package A14_ArrayList;

import java.util.ArrayList;

public class InitializeArrayList {
	/*
	 *We don't need any extra method for printing it
	 * list.add("John");
	 * list.get(0);
	 * list.size();
	 * list.set(0, "Bulut");
	 * list.remove("Elvis");
	 * list.remove(idx);
	 * list.isEmpty();
	 * list.clear();
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// list[0] = "John"; ArrayListlerde ise yaramaz cunki arraylerde baslatilirken boyut veriliyor ve 
				//ici sifir dolduruluyor. Ama ArrayListler baslarken bos.
		list.add("John");	
		list.add("Elvis");
		list.add("Nikita");
		
		// adding element at specific position
		list.add(0,"charli");
			
		// We dont need any extra method for printing it
		System.out.println(list);
		
		// Access retrieve/get/take to element of List
		String name = list.get(0);		
		System.out.println("Sifirinci element " + name);
		
		//Size of list
		int sizeList = list.size();
		System.out.println("Size of list is " +  sizeList);
		
		// changing element of list
		list.set(0, "Bulut");
		System.out.println(".set den sonra Sifirinci element " + list.get(0));
		
		// remove an element from list
		list.remove("Elvis");
		System.out.println("Remove elvis " + list);
		
		// remove an element from list
		list.remove(0);
		System.out.println("Remove index 0 " + list);
		
		
		//check array is empt
		boolean checkEmpty = list.isEmpty();
		System.out.println("Is list empty? ->" + checkEmpty);
		
		//remove everyting from list
		list.clear();
		System.out.println("Is list empty? ->" + list.isEmpty());
		
	}

}
