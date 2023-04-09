package A14_ArrayList.Tasks;

import java.util.ArrayList;

public class Task1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Red");
		colours.add("Black");
		colours.add("Green");
		colours.add("Pink");
		System.out.println(colours);
		
		for(String colour : colours) {
			
			System.out.println(colour);			
			
		}
		
		for (int i=0; i<colours.size();i++) {
			
			System.out.println(colours.get(i));
			
		}
		// method for adding a color at 0 indx
		addAttZero(colours, "Violet");
		System.out.println(colours);
		
	}
	
	// This method adds the new color at 0 idx.
	public static void addAttZero(ArrayList<String> clrs, String newColor) {
		
		clrs.add(0, newColor);
		
	}

}
