package learning;

/**
 * @author denis 30/5/2020
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	public static void main(String args[]) {
		
		//list1
		String[] things = {"eggs", "lassers", "hats", "pie"};
		
		List<String> list1 = new ArrayList<String>();
		
		//add items to the list1
		for(String x: things)
			list1.add(x);
		
		
		//list2
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		//add items to the list2
		for(String y: morethings)
			list2.add(y);
		
		//print list1
		for(int i =0; i < list1.size(); i++) {
			
			System.out.printf(" %s", list1.get(i));
			//System.out.println("\n");
		} 
		
		//print list2
          for(int i =0; i < list2.size(); i++) {
			
			System.out.printf(" %s", list2.get(i));
		}



            //delete items which are not in l2
         //edit list1 to list2
        editlist(list1,list2);
        System.out.println();
        
        //then print list1
        for(int i =0; i < list1.size(); i++)
        {
        	System.out.printf(" %s", list2.get(i));
        }
        
		
	} //end main fun
	
	//edit list function
	//delete items which are not in l2
	public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> denis = l1.iterator();
		
		while(denis.hasNext()) {
			if(l2.contains(denis.next()))
				denis.remove();
		}
		
		
	}

	

}
