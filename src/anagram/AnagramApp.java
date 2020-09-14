package anagram;

/*
 * @author denis 23/6/2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {

	static int size;
	static int count;
	static char[] arrChar = new char[100];
	
	public static void doAnagram(int newSize) {
		if(newSize ==1 )                       //if too small
			return;                             //go no further
			for(int j =0; j<newSize; j++) {         //for each
				doAnagram(newSize - 1);          //anagram remaining
				if(newSize == 2)                 //if innermost
					displayWord();           //display it
				rotate(newSize);                         //rotate a word
				
			}
				
		}
	
		//rotate all characters from position to the end
	private static void rotate(int newSize) {
		// TODO Auto-generated method stub
		
		int j;
		int position = size -newSize ;       //first first letter
		char temp = arrChar[position];          //shift other left
		
		for(j = position +1; j<size; j++)
			arrChar[j-1] = arrChar[j];
		arrChar[j-1] = temp;                //put first on right
		
	}

	public static void displayWord() {
		if(count < 99)
			System.out.print("\t");
		if(count <9)
			System.out.print("\t");
		System.out.println(++count +"");
		
		for(int j =0; j < size; j++)
			System.out.print(arrChar[j]);
		System.out.println("\t");
		System.out.flush();
		
		if(count % 6 ==0)
			System.out.println("\t");
			
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	//main fnc
	
	public static void main(String args[]) throws IOException{
		
		System.out.println("enter a word:");  //get a word
		System.out.flush();
		String input = getString();
		size = input.length();          //find its size
		
		count = 0;
		
		for(int j =0; j<size; j++)    //put an array
			arrChar[j] = input.charAt(j);
		doAnagram(size);                    //anagram it
		
		
	}
	
	
	
}
















