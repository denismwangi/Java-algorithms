package hash;

/*
 * @author denis 3/6/2020
 */

import java.util.*;

public class Set1 {
	
	public static void main (String args[]) {
		
		String[] items = {"apple", "bob", "ham","bacon","pork" ,"bob"};
		List<String> list1 =Arrays.asList(items);
		
		//print items
		System.out.printf("%s", list1);
		System.out.println();
		
		//remove duplicate items
		Set<String> things = new HashSet<String>(list1);
		System.out.printf("%s", things);
		
 	}

}
