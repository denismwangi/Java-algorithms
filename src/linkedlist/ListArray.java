package linkedlist;

/**
 * @author denis 2/6/2020
 */


import java.util.*;

public class ListArray {
	
	public static void main(String args[]) {
		
		String[] stuff = {"babbie", "watermelon", "melon"," apple", "eggs"};
		LinkedList<String> mylist = new LinkedList<String>(Arrays.asList(stuff));
		
		//add some stuff
		mylist.add("pumking");
		mylist.addFirst("bannana");
		
		//convert it back to an array
		stuff = mylist.toArray(new String[mylist.size()]);
		
		for(String x: stuff)
			System.out.printf("%s", x);
		
	}

}
