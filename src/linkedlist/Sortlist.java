package linkedlist;

/**
 * @author denis 2/6/2020
 */


import java.util.*;

public class Sortlist {
	
	public static void main(String args[]) {
		
		String[] crap = {"aples", "facebook", "youtube", "twittwe"};
		
		//convert array to list
		List<String> list1 = Arrays.asList(crap);
		
		//sort alphetically
		Collections.sort(list1);
		System.out.printf("%s\n",list1);
		
		//sort reversed order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("%s\n",list1);
		
		
	}

}
