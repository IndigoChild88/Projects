import java.util.*;

	 
 
public class DoublyLinkedList<T extends Comparable>{     

	 private class Node <T>    {  
		 private T data;  
		 private Node<T> next; 
		 private Node<T> prev;    
		 private Node (T d){
			 data=d;
			 next=null;
			 prev=null;
		 }
	 private Node (T d, Node pref, Node nref){
		 data=d;
		 prev=pref;
		 next=nref;
		 
	 } }       
	 private Node<T> head;    
	 private Node<T> current;     
	 private int size;         
	 public DoublyLinkedList() {
		 head=null;
		 current =head;
		 size=0;
	 }
	 public DoublyLinkedList (DoublyLinkedList<T>  l)  {
		 
	 }
	 //insert's the new value into its proper ordered position in the list    
	 public void insert (T d) {
		 Node temp=new Node(d);
		 if (size==0) {
			
			 temp=new Node(d,head,head);
			 //head.next=temp;
			 
			// head.next=temp;
			// temp.next=head;
			 //temp.prev=head;
			// head.prev=temp;
			 }
		 else if (size==1) {
			 temp=new Node(d,head,null);
			 
			 
			 
			// Node tempB=head.prev;
			 //tempB.next=temp; temp.prev=tempB;
			 //temp.next=head; head.prev=temp;
		 }else{
			
		 }
		 size++; 
	 }
 
 
    //removes an existing value from the list     
public void remove (T d) throws ListEmptyException, NotInListException {
	Node temp=new Node(d);
	boolean not=false;
	if (size==0) {
		throw new ListEmptyException("List is empty!");
	}
	Node tempB=head.next;
	for(int i=0; i<size;i++) {
		if (tempB==temp) {
			not=true;
			Node tempP = tempB.prev;
			tempP.next=tempB.next;
			size--;
			break;         
		} tempB=tempB.next;
	}
	if(not==false) {
		throw new NotInListException("Not in the List");
	}
		
	}
 
    //positions the list at the beginning of the list (the actual first node)    
	public void begin() {
		current=head;
	}
 
    //advances to the next element in the list     
	public void advance() {
		current=current.next;
	}
 
    //retreats to the previous item in the list    
	public void retreat() {
		current = current.prev;
	}
 
    //returns the value at the current point of the list     
	public T current() throws ListEmptyException {
		if (size==0) {
			throw new ListEmptyException("List is empty");
		}
		else {
			return current.data;
		}
	}
 
    //determines if we are at the end of the list    
	public boolean end() {
		boolean end =false;
		if (current==head) {
			end = true;
		}
		return end;
	}
 
    //determines if empty    
	public boolean isEmpty() {
		boolean empty=false;
		if (size==0) {
			empty=true;
		}
		return empty;
	}
 
    //returns the number of elements in the list     
	public int size() {
		return size;
	}
}