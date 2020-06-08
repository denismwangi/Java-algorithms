package learning;




/*
 * @author denis 3/6/2020
 */

public class Threadss {
	
	public static void main(String args[]) {
		
		//create threads
		Thread t1 = new Thread(new Dennis("one")); 
		Thread t2 = new Thread(new Dennis("Two")); 
		Thread t3 = new Thread(new Dennis("three")); 
		Thread t4 = new Thread(new Dennis("four")); 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
	
}
