package stack;

import java.util.*;

/*
 * @author denis 3/6/2020
 */


public class Stack1 {
	
	private static void printStack(Stack<String> dennis) {
		 
		if(dennis.isEmpty())
			System.out.println("you have zero items");
		else
			System.out.printf("%s TOP\n", dennis);
	 }
	
	 
	public static void main(String args[]) {
		
		 Stack<String> stack = new Stack<String>();
		 
		 //populate stack with items
		 stack.push("bottom");
		 printStack(stack);
		 
		 stack.push("second");
		 printStack(stack);
		 
		 stack.push("third");
		 printStack(stack);
		 
		 //remove all items
		 stack.pop();
		 printStack(stack);
		 
		 stack.pop();
		 printStack(stack);
		 
		 stack.pop();
		 printStack(stack);
		 
		 
		 
	}
	
	
	

}
