package learning;

/**
 * @author denis 31/5/2020
 */


public class Substrings {
	
	public static void main(String args[]) {
		
		String s = "buckyrobertsbuckyroberts";
		
		//search  first k character
		System.out.println(s.indexOf('k'));
		
		//search from the fifth character
		System.out.println(s.indexOf('k', 5));
		
		//search string
		System.out.println(s.indexOf("rob"));
		
		//search from 10th 
		System.out.println(s.indexOf("rob", 10));
	}

}
