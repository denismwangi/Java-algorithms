package stack;


/*
 * @author denis 10/6/2020
 */
class Stacking{
	
	private int maxSize;          //size of stack array
	private double[] stackArray;  
	private int top;                //top of the stack
	  
	
	//constructor
	public Stacking(int s) {
		maxSize = s ;                     //set the array size
	    stackArray = new double[maxSize];  //create array
		top = -1 ;                          //no items yet
	}
	
	//put items on the stack
	public void push(double j) {
		
		stackArray[++top] = j;        //increament top insert item
	}
	
	//take items from the stack
	public double pop() {
		
		return stackArray[top--];      //access item decrement top
	}
	
	//peek at the top of stack
	public double peek() {
		return stackArray[top];
	}
	
	//true if stack is empty
	public boolean isEmpty() {
		
		return (top == -1);
	}
	
	//true if stack is full
	public boolean isFull() {
		
		return (top == maxSize-1);
	}
	
}
public class Stackx {
	
	public static void main (String args[]) {
		
		Stacking items = new Stacking(10);      //make new stack
		
		//push items to the stack
		items.push(20);
		items.push(30);
		items.push(40);
		items.push(60);
		
		/*
		if(!items.isFull())
			insert(item);
		else
			System.out.println("cant insert the stack is full");
		*/
		
		
		while(!items.isEmpty()) {
			
			double value = items.pop();         //until stack is empty remove items
			System.out.println(value);          //display it
			System.out.print("");
		}
		
		System.out.print("");
	}

}























