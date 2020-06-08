package searching;

import java.io.*; 


/*
 * @author denis 6/6/2020
 */

public class NomalSearch {
	
	public static void main(String args[]) throws IOException
	{
		
		int[] arr;
		arr = new int [100];
		int nElems = 0;
		int j;
		int searchKey;
		 
		 //insert 10 items
		 arr[0] = 77; // insert 10 items
		 arr[1] = 99;
		 arr[2] = 44;
		 arr[3] = 55;
		 arr[4] = 22;
		 arr[5] = 88;
		 arr[6] = 11;
		 arr[7] = 00;
		 arr[8] = 66;
		 arr[9] = 33;
		 nElems = 10; 
		 
		 
		for(j =0; j< nElems; j++)
			System.out.println(arr[j]+ "");
			 System.out.println("");
		 
		 
				 
			 
			searchKey = 89; // key we are searching
			for(j =0; j< nElems; j++)
				if(arr[j] == searchKey)
					break;
			
			if(j == nElems)
				System.out.println("not found" +searchKey);
			else
					System.out.println("found" +searchKey);
			System.out.println();
		
			
			
		 
		 
	}

}
