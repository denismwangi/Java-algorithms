package searching;

/*
 * @author denis 5/6/2020
 */

class person{
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	//constructor
	public person(String first, String last, int a) {
		firstName  = first;
		lastName = last;
		age =a;
			
	}
	
	public void displayPerson() {
		 System.out.print(", First name: " + firstName);
		System.out.print(" Last name: " + lastName);
		 System.out.println(", Age: " + age);
		
	}
	
	//get last name
	public String getFast() {
		return firstName;
		
		
	}
}

class PersonDataArray{
	
	private person[] a;  //reference array
	private int nElems; //number of data items

 
//constructor
      public PersonDataArray(int max) {
	         a = new person[max];         //create array
	         nElems = 0;          //no items yet
	
    }
	
	public person find(String searchName) {
		int j;                                     //find specific value
		for(j =0; j < nElems; j++)                 //for element
			if(a[j].getFast().equals(searchName))  //found
				break;                             //exit the loop
		
		//yes can't find it
		if(j == nElems)
			return null;
		//no found it
		else
			return a[j];
						
	}
	
	// put Person into array
	 public void insert(String last, String first, int age)
	 {
	 a[nElems] = new person(last, first, age);
	 nElems++; // increment size
	 }
	 
	
	//display array contents
	public void display() {
		for(int j = 0; j < nElems; j++)  //for each element display it
			a[j].displayPerson();
		
	}
	
	
}

public class PersonSearch {
	
	public static void main(String args[]) {
		
		int maxSize = 100;   //array size
		PersonDataArray arr;       //reference array
		arr = new PersonDataArray(maxSize); //create array
		
		//insert 10 items
		arr.insert("Evans", "Patty", 24);
		 arr.insert("Smith", "Lorraine", 37);
		 arr.insert("Yee", "Tom", 43);
		 arr.insert("Adams", "Henry", 63);
		 arr.insert("Hashimoto", "Sato", 21);
		 arr.insert("Stimson", "Henry", 29);
		 arr.insert("Velasquez", "Jose", 72);
		 arr.insert("Lamarque", "Henry", 54);
		 arr.insert("Vang", "Minh", 22);
		 arr.insert("Creswell", "Lucinda", 18);
		 
		 
		 //display items 
		 arr.display();
		 System.out.println();
		 
		 
		 //search for items
		 String searchKey = "Adams";
		 person found;
		 
		 found = arr.find(searchKey);
		 if(found !=null) {
			 System.out.print("person Found\n ");
			 found.displayPerson();
		 }
		 else {
			 System.out.println("Can't find " + searchKey);
 
		 }
			 
	}

}

























