package sorting;


/*
 * @author denis 25/6/2020
 */

class SortApp{
	
	private double[] theArray;
	private int nElems;
	
	public SortApp(int max) {
		
		theArray = new double[max];
		nElems = 0;
	}
	
	public void insert(double value) {
		theArray[nElems] = value;
		nElems++;
	}
	
	
	public void display() {
		System.out.print("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] +"");
		System.out.println();
	}
	
	public void SortQuick() {
		theQuickSort(0, nElems-1);
	}
	public void theQuickSort(int left, int right) {
		if(right-left <=0)
			return;
		else {
			double pivot = theArray[right];
			
			int partition = partitionIt(left,right,pivot);
			theQuickSort(left, partition-1);
			theQuickSort(partition+1, right);
			
		}
	}
	
		public int partitionIt(int left, int right, double pivot) {
			int leftPtr = left-1;
			int rightPtr = right;
			while(true) {
				while(theArray[++leftPtr] < pivot);
				while(rightPtr >0 && theArray[--rightPtr] > pivot);
				
				if(leftPtr >= rightPtr)
					break;
				else
					swap(leftPtr, rightPtr);
			}
			swap(leftPtr, right);
			return leftPtr;
			
		}
		
		public void swap(int dex1, int dex2) {
			double temp = theArray[dex1];
			theArray[dex1]= theArray[dex2];
			theArray[dex2] = temp;
		}
	
}
public class QuickSort{
	
	public static void main(String args[]) {
		int maxsize = 16;
		SortApp arr;
		arr = new SortApp(maxsize);   //create array
		
		//fill the array with random numbers
		for(int j =0; j<maxsize; j++) {
			double n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.SortQuick();
		arr.display();
	}
}

















