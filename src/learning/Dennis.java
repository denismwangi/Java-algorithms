package learning;

/*
 * @author denis 3/6/2020
 */

import java.util.*;
	
	//Runnable interface contains run() method
public class  Dennis implements Runnable {
		
		String name;
		int time;
		Random r = new Random();
		
		//constructor
		public Dennis(String x) {
			name = x;
			time = r.nextInt(999);
		}
		
		//run method
		public void run() {
			
			try {
				System.out.printf("%s us aleping for %d\n", name ,time);
				Thread.sleep(time);
				System.out.printf("%s is done %d\n ", name);
				
			}catch(Exception e) {
				
			}
		}
		

		  
	}


