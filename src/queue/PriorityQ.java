package queue;

import java.io.IOException;

/*
 * @author denis 10/6/2020
 */
class PrioQ{
	
	//array in sorted order from max 0 to min at size -1
	private int maxSize;
	private double[] queArray;
	private int nItems;
	
	//constructor
	public PrioQ(int s) {
		maxSize = s;
		queArray = new double[maxSize];
		nItems= 0;
	}
	
	//insert items
	public void insert(double item) {
		int j;
		
		if(nItems == 0)                          //if no items insert at 0
			queArray[nItems++] = item;
		else {                                   // if any item
			for(j = nItems-1; j >= 0; j--)       //start at the end
			{
				if(item > queArray[j])           //if new item
					queArray[j+1] = queArray[j]; //shift upward
				else                              //if smaller
					break;                        //done shifting
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	//remove min item
	public double remove() {
		return queArray[--nItems];
		
	}
	
	//peek at min item
	public double peekMin() {
		return queArray[nItems-1];
	}
	
	//true if que is empty
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	//tru if que is full
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
}

public class PriorityQ {
	public static void main(String args[]) throws IOException{
		PrioQ denis = new PrioQ(5);
		
		denis.insert(30);
		denis.insert(50);
		denis.insert(60);
		denis.insert(10);
		denis.insert(40);
		
		while(!denis.isEmpty()) {
			double item = denis.remove();
			System.out.println(item + "");
		}
			
	}

}























