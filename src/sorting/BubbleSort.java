package sorting;


/*
 * @author denis 7/6/2020
 */

class ArrayBuble{
	
	private double[] items;  //ref to array
	private int nElems;      //no of data in array
	
	public ArrayBuble(int max) {
		items = new double[max];  //array size
		nElems = 0;               //set items to zer0
	}
	
	
	//put element to the array
	public void insert(double value) {
		
		items[nElems] = value;  //insert it
		nElems++  ;               //increament size
	}
	
	//display array items
	public void display() {
		
		for(int j= 0; j < nElems; j++)
			System.out.println(items[j] +"");
		System.out.println();
		
	}

	//buble sort func
	public void bubblesort() {
		
		int in;
		int out;
		
		for(out=nElems-1; out > 1; out--) //outer loop backward
			for(in=0; in<out; in++)      //inner loop forward
				
				//out of order swap them
			if(items[in] > items[in+1])
				swap(in, in+1);
				
			
	}
	
	//sawp func
	private void swap(int one, int two) {
		
		double temp = items[one];
		items[one] = items[two];
		items[two] = temp;
	}
}


public class BubbleSort {
	
	public static void main(String args[]) {
		int maxSize = 100;
		ArrayBuble arr;
		arr = new ArrayBuble(maxSize);
		
		//insert items
		arr.insert(77);
		arr.insert(10);
		arr.insert(17);
		arr.insert(87);
		arr.insert(7);
		arr.insert(45);
		arr.insert(18);
		arr.insert(100);
		
		arr.display(); //display items
		arr.bubblesort(); //bubble sort them
		arr.display();    //display sorted items
		
	}

}

/* the code is working right? 
 * 
 * lets now look at the efficiency of bubble sort algorithim
 * 
 * 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45
 * In general, where N is the number of items in the array, there are N–1 comparisons on 
 * the first pass, N–2 on the second, and so on. The formula for the sum of such a series is
 * (N–1) + (N–2) + (N–3) + ... + 1 = N*(N–1)/2
 * 
 * N*(N–1)/2 is 45 when N is 10.
 * 
 * 
 * Thus the algorithm makes about N2/2 comparisons (ignoring the –1, which doesn't make 
 * much difference, especially if N is large).
 * 
 * 
 * 
 * 
 * 
 * argh!! i cant do all the calculations
 */



















