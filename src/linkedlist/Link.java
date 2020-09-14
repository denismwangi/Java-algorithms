package linkedlist;

/*
 * @author denis 21/6/2020
 */


class linking{
	
	public int iData;          //data item (key)
	public double dData;         //dta item
	public linking next;          //next link in list
	
	
	//constructor
	public linking(int id, double dd) {
		
		iData = id;   //initialize data
		dData = dd;     //next is set to null auto
	}
	
	
	public void displayLink() {
		System.out.print("{" +iData + "," +dData+ "}");
	}
}

class LinkList{
	
	private linking first;          //ref to first linkon list
	
	//constructor
	public LinkList() {
		first = null;         //no items yet
	}
	
	public boolean isEmpty() {
		
		return(first == null);           //true if list is empty
	}
	
	
	//insert at the start of the link
	public void insertFirst(int id, double dd) {
		linking newLink = new linking(id ,dd);        //make new link
		newLink.next = first;                       //newlink --> oldfirst
		first = newLink;                           //first -->newlink
		
		
	}
	
	//delete first item
	public linking deleteFirst() {
		linking temp = first;    //assumes lit not empty
		first = first.next;   //save reference to link
		                       //delete it : first--> old next
		return temp;             // return deleted link
	} 
	
	public void displayList() {
		System.out.print("List (first-->last):");
		linking current = first;                         //start at begining of list
		
		while(current != null) {                           //until end of list
			current.displayLink();                        //print data
			current = current.next;                          //move to next link
		}
		System.out.println("");
	}
	
	

	
	
}

public class Link {
	
	public static void main(String [] args) {
		
		LinkList thelist = new LinkList();   //make new list
		
		
		//insert four items
		thelist.insertFirst(22, 2.99);
		thelist.insertFirst(44, 4.99);
		thelist.insertFirst(66, 6.99);
		thelist.insertFirst(88, 8.99);
		
		thelist.displayList();     //display the list
		
		while(!thelist.isEmpty()) {      //until is empty
			
			linking aLink = thelist.deleteFirst();            //delete link
			System.out.print("deleted");                  //display it
			aLink.displayLink();
			System.out.println("");
			
		}
		
		thelist.displayList();        //display list
		
	}


	

}
























