package searching;

/*
 * @author denis 5/6/2020
 */

 class SearchLinear {
	
	
	private double[] a; //array a
	private int nElems; //no of data items
	
	public SearchLinear(int max) {
		
		a = new double[max];   //create an array
		nElems = 0;
	}
	
	public int size() {
		
		return nElems;
	}
	
	public int find(double searchKey) {
		
		int lowerBound = 0;
		int upperBound = nElems;
		int curIn;
		
		while(true) {
			curIn = (lowerBound + upperBound) /2 ;
			if(a[curIn] == searchKey)
				return curIn;         //found it
			
			if(lowerBound > upperBound)
				return nElems;            //can't find it
			
			   //divide the range
			
			else {
				
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1;    //its in upper half
				else
					upperBound = curIn - 1;     //its in the lower half
			}
			
		}
	}
	
	
	//put element into an array
	public void insert(double value) {
		
		int j;
		for(j = 0; j < nElems; j++)    //find where it goes
			if(a[j] > value)           //linear search
				break;
		
		//move higher ones up
		for(int k = nElems; k > j; k--)
			a[k] = a[k-1];
		a[j] = value;  //insert it an increment the size
		nElems++;
		
	}
	
	public boolean delete(double value) {
		
		int j = find(value);
		if(j == nElems)
				return false;      //can't find it
		else {                     //found it
			
			for(int k = j; k < nElems; k++)  //move higher ones down
				a[k] = a[k+1];
			nElems--;                        //decrement size
			return true;
		}
	}
	
	//displays array contents
	public void display() {
		
		for(int j = 0; j < nElems; j++)  //for each element display
			System.out.print(a[j] + "");
		System.out.println("");
		
	}
	

}
public class Search1{
	public static void main(String args[]) {
		
		int maxSize = 100;           //array size
		SearchLinear arr;            //reference to array
		arr = new SearchLinear(maxSize);   //create the array
		
		//insert 10 items
		arr.insert(77);
		  arr.insert(99);
		 arr.insert(44);
		 arr.insert(55);
		 arr.insert(22);
		 arr.insert(88);
		 arr.insert(11);
		 arr.insert(00);
		 arr.insert(66);
		 arr.insert(33);
		 
		 int searchKey = 55;  //search for an item
		 if(arr.find(searchKey) !=arr.size())
		 System.out.println("found " +searchKey);
		 else{
			 System.out.println("not found " +searchKey);
			 
			 arr.display();     //display items
			 
			 
			 //delete 3 items
			 arr.delete(00); // delete 3 items
			 arr.delete(55);
			 arr.delete(99);
			 
			 //display items again
			 arr.display();
		 }
		
	}
	
	
}






















