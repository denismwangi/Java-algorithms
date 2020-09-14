package linkedlist;

/*
 * @author denis 21/6/2020
 */


class Link1{
	
	public int iData;          //data item (key)
	public double dData;         //dta item
	public Link1 next;          //next link in list
	
	
	//constructor
	public Link1(int id, double dd) {
		
		iData = id;   //initialize data
		dData = dd;     //next is set to null auto
	}
	
	
	public void displayLink() {
		System.out.print("{" +iData + "," +dData+ "}");
	}
}

class LinkListy{
	
	private Link1 first;          //ref to first link on list
	
	//constructor
	public LinkListy() {
		first = null;         //no items yet
	}
	
	/*
	public boolean isEmpty() {
		
		return(first == null);           //true if list is empty
	}
	*/
	
	//insert at the start of the link
	public void insertFirst(int id, double dd) {
		Link1 newLink = new Link1(id ,dd);        //make new link
		newLink.next = first;                       //newlink --> oldfirst
		first = newLink;                           //first -->newlink
		
		
	}
	
	public Link1 find(int key) {    //find link with a given key
		                               //assumes non-emptylist
		
		Link1 current = first;      //start at first
		while(current.iData != key) {    //while no match
			
			if(current.next == null) {    //if end of the list
				return null;               //didnt find it
			}else {                         //not the end of list
				current = current.next;        //go to the next link
			}
		}
		
		return current;       //found it
		
	}
	
	/*
	//delete first item
	public linking deleteFirst() {
		linking temp = first;    //assumes lit not empty
		first = first.next;   //save reference to link
		                       //delete it : first--> old next
		return temp;             // return deleted link
	} 
	*/
	
	
	 //delete link with a given key
	//assumes non empty list
	public Link1 deleteKey(int key) {
		
	Link1 current = first;       //search for lin
		Link1 previous = first;
		
		while(current.iData != key) {
			
			if(current.next == null)
				return null;               //didnt find it
			else
			{
				previous = current;            //go tot the next link
				current = current.next;
			}
		}
		 
		//found it
		if(current == first)           //if first link
			first = first.next;             //change first
		else                                  //otherwise
			previous.next = current.next;         //bypass it
		return current;
	}
	public void displayList() {
		System.out.print("List (first-->last):");
		Link1 current = first;                         //start at begining of list
		
		while(current != null) {                           //until end of list
			current.displayLink();                        //print data
			current = current.next;                          //move to next link
		}
		System.out.println("");
	}
	
	

	
	
}

public class LinkSearch  {
	
	public static void main(String [] args) {
		
		LinkList thelist = new LinkList();   //make new list
		
		
		//insert four items
		thelist.insertFirst(22, 2.99);
		thelist.insertFirst(44, 4.99);
		thelist.insertFirst(66, 6.99);
		thelist.insertFirst(88, 8.99);
		
		thelist.displayList();     //display the list
		
		
	     	Link1 item = thelist.find(44);
	     	if(item != null)
	     		System.out.println("found link " + item.iData);
	     	else
	     		System.out.println("cant find link");
	     	
	     	Link1 item2 = thelist.deleteKey(66);
	     	if(item2 !=null)
	     		System.out.println("deleted link with key" +item2.iData);
	     	else
	     		System.out.println("cent delete link");
	     
		
		thelist.displayList();        //display list
		
	}


	

}
























