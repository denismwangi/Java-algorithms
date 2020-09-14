package queue;


/*
 * @author denis 10/6/2020
 */

class testQue{
	
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	//constructor
	public testQue( int s) {
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
	     nItems = 0;
		
	}
	
	//put item to the real of the queue
	public void insert(int j) {
		
		if(rear == maxSize-1)               //deal with the wrap around
			rear = -1;                      
		queArray[++rear] = j;                //incr the rear and insert
		nItems++;                             //one more item
	}
	
	//take  item from the front queue
	public int remove() {
		int temp = queArray[front++];          //get the value and incr font
		if(front == maxSize)                   //deal with the wrap around
			front = 0;
		nItems--;                              // one less item
		return temp;
	}
	
	//peek at the front of the queue
	public int peekFront() {
		return queArray[front];
	}
	
	//true if que is empty
	public boolean isEmpty() {
		return (nItems == 0);
		
	}
	
	//true if que is full
	public boolean isFull() {
		return (nItems == maxSize);
	}
	public int size() {
		return nItems;
	}
}

public class Queues {
	
	public static void main(String args[]) {
		testQue items = new testQue(5);             //queue hold five items
		
		
		//insert 4 items
		items.insert(10);
		items.insert(20);
		items.insert(30);
		items.insert(40);
		
		//remove 3 items 10, 20 ,30
		items.remove();
		items.remove();
		items.remove();
		
		//insert 4 more items
		items.insert(60);
		items.insert(70);
		items.insert(80);
		items.insert(90);
		
		//remove and display
		while(!items.isEmpty()) {
			
			int n = items.remove();    //remove all items now
			System.out.println(n);
			System.out.println();
		}
		System.out.println();
		
	}

}




















