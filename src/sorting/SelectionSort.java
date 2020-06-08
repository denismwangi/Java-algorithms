package sorting;


/*
 * @author denis 8/6/2020
 */

class Selection{
	
	private double[] items;
	private int nElems;
	
	public Selection(int max) {
		
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
	
	public void selectionSort() {
		int in;
		int out;
		int min;
		
		for(out =0; out < nElems-1; out++ ) {
			min = out;
			for(in = out+1; in < nElems; in++)
				if(items[in] < items[min])
					min = in;
			swap(out, min);
			
		}
			
		
	}
	private void swap(int one , int two) {
		double temp = items[one];
		items[one] = items[two];
		items[two] = temp;
		
	}
}

public class SelectionSort {
	
	public static void main(String[] args) {
		int maxSize = 100;  
		Selection arr;
		arr = new Selection(maxSize);
		
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
		 arr.selectionSort();
		  System.out.println("sorted items");
		 arr.display();
		
	}

}




















