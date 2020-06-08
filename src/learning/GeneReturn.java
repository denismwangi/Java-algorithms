package learning;


/*
 * @author denis 3/6/2020
 */

public class GeneReturn {
	
	//generic method
		//only objects that inherits from comparable class
		public static <T extends Comparable<T>> T max(T a, T b, T c) {
			
			T m = a; //assume a is greatest
			
			if(b.compareTo(a) > 0)
				m = b;
			if(c.compareTo(m) > 0)
				m = c;
			
			return m;
		}
	
	public static void main(String [] args) {
		
		System.out.println(max(23,24,56));
		System.out.println(max("pork","ham","tot"));
	}
	

}
