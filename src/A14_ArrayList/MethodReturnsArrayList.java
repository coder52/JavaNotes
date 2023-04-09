package A14_ArrayList;

import java.util.ArrayList;

public class MethodReturnsArrayList {
	public static void main(String[] srgs) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("French");
		languages.add("English");
		languages.add("Turkish");
		languages.add("Kazakh");
		languages.add("German");
		languages.add("Tajik");
		
		ArrayList<String> T_sh = selector(languages, "T", "sh");
		
		System.out.println(T_sh);	
		
	}

	public static ArrayList<String> selector(ArrayList<String> strings, String begin, String end){
		
		ArrayList<String> newStr = new ArrayList<>();
		
		for(String str : strings) {
			if(str.startsWith(begin) || str.endsWith(end) ) {
				newStr.add(str);
			}
		}
		return newStr;
	}
}
