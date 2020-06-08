package linkedlist;
/**
 * @author denis 2/6/2020
 */


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List1 {
	
	public static void main(String args[]) {
		
		String[] food1 = {"butter", "cheese", "bacon", "goats", "pork"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x :food1)
			list1.add(x);
		
		
		String[] food2 = {"sausage", "popcan", "rice", "cheese", "tea"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y: food2)
			list2.add(y);
		
		//combine list2 to list1
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5);  //removes items 2 and 5
		printMe(list1);
		reverseMe(list1);
		
		
	}//end main
	
	//printMe methond
	private static void printMe(List<String> z) {
		for(String b : z)
			System.out.printf("%s\n", b);
		System.out.println();
		
		
	}
	
	//removeStuff methond
      private static void removeStuff(List<String> z, int from , int to) {
	    z.subList(from, to).clear();
	    
       }
      
      //reverseMe methond
      private static void reverseMe(List<String> z) {
    	  ListIterator<String> dennis = z.listIterator(z.size());
    	  
    	 if(dennis.hasPrevious())
    		  System.out.printf("%s", dennis.hasPrevious());
      }
}














