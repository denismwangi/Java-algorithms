package learning;

/*
 * @author denis 3/6/2020
 */

public class Gene {
	
	//generic method
		//instead of using overloaded methods
		public static <T> void printMe(T[] x){
			for(T dennis : x)
				System.out.printf("%s", dennis);
			System.out.println();
		}
		
		//remove overloaded method
		/*
		public static void printMe(Integer[] i) {
			
			for(Integer x: i)
				System.out.printf("%s", x);
			System.out.println();
			
		}
	public static void printMe(Character[] i) {
			
			for(Character x: i)
				System.out.printf("%s", x);
			System.out.println();
			
		}
	*/

	
	public static void main(String args[]) {
		
		Integer[] iray = {1,2,3,4,5,6,7};
		Character[] crazy = {'b','u','c','k','y'};
		
		printMe(iray);
		printMe(crazy);
		
	}
	
	
}
