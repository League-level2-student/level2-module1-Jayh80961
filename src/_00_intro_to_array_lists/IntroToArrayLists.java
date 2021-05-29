package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("bob");
		names.add("jeff");
		names.add("cad");
		names.add("jeffery");
		names.add("wong");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("String element " + i + " " + s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : names){
			System.out.println(s);
		}
	}
}
