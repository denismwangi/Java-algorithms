package sorting;


/*
 * @author denis 7/6/2020
 */

public class BubbleSort2 {
	
		public static void main(String args[]) {
			
			int nums[] = {99, 4, 6, 8, 3,78, 998, 10, 98,100};
			
			int a ,b , t;
		    int size;
		    size = 10;
		    
		    //display original array
		    System.out.println("Original array is :");
		    
		    for(int i = 0; i < 10; i++)
		    	System.out.println("" + nums[i]);
		    
		    System.out.println();
		    
		    //now bubble sort array
		    for(a =1; a < size; a++)
		    	for(b = size-1; b >= a; b--){
		    		
		    		if(nums[b-1] > nums[b]) {
		    			
		    			//if out of order exchange the elements
		    			
		    			t = nums[b-1];
		    			nums[b-1] = nums[b];
		    			nums[b]= t;
		    		}
		}
		    
		    //display the sorted array
		    
		    System.out.println("sorted array is:");
		    for(int i = 0; i < size; i++)
		    	System.out.println("" +nums[i]);
		    
		    System.out.println();
		    
	}
	


}
