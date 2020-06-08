package sorting;



/*
 * @author denis 8/6/2020
 */

class Insert {
	
	
	private double[] items;
	private int nElems;
	
	public Insert(int max) {
		
		items = new double[max];
		nElems = 0;
	}
	
	public void insert(double value) {
		
		items[nElems] = value;
		nElems++;
		
	}
	public void display() {
		for(int j =0; j<nElems; j++)
			System.out.println(items[j] +"");
		System.out.println();
		
	}
	public void insertionSort() {
		int in;
		int out;
		double temp = 0;
		
		
		for(out=1; out < nElems; out++ )        //out is dividing the line
           temp = items[out];           //remove marked itms
		    in = out;                              //start shift to out
		    
		    while(in > 0 && items[in-1] >= temp) {  //until one is smaller
		    
		    	items[in] = items[in-1];              // shift item right,
		    	in--;                                // go left one position
		    }
		    
			items[in] = temp;                        // insert marked item
	}

}

public class InsertSort{
	
	
	public static void main(String[] args) {
		int maxSize = 100;  
		Insert arr;
		arr = new Insert(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		 arr.insert(44);
		 arr.insert(55);
		 arr.insert(22);
		 arr.insert(88);
		 arr.insert(11);
		 arr.insert(00);
		 arr.insert(66);
		 arr.insert(33);
		 
		 arr.display();
		 arr.insertionSort();
		  System.out.println("sorted items");
		 arr.display();
		
	}
	
}











