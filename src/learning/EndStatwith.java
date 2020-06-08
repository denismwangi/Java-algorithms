package learning;

/**
 * @author denis 31/5/2020
 */


public class EndStatwith {
	
	public static void main(String args[]) {
		
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		// start with
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w + " starts with fu");
			
		}
		
		//Ends with
		
				for(String w : words) {
					if(w.endsWith("unk"))
						System.out.println(w + " ends with unk");
					
				}
		
		
		
	}

}
