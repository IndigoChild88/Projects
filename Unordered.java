/**
* CS 111 Section 003
* Lab Assignment 9
* Albert Nunez **/
public class Unordered<T> {
	// Holds the constructor to create a node
	private static class Node<T>{
		private T data;
		private Node<T> next;
		private Node (T d) {
			data = d;
			next= null;
		}
		private Node (T d, Node<T> ref) {
			data = d;
			next = ref;
			
		}
	}
	private Node<T> head;
	private int numEle;
	// Null constructor
	public Unordered(){
	head=null;
	numEle=0;
	}
	// add a node to the list
	public void add(T value) {
		
		if(numEle==0) {
			Node<T>temp=new Node<T>(value);
			head=temp;
		}

		else {
			Node<T> current=new Node<T>(value);
			//Node<T> prev=head.next;
			current.next=head;
			head=current;
			//current.next=prev;
		}numEle++;
	}
	//remove nodes from the list 
	// if an element does exist on the list, it'll print out that it doesn't exist
	public void remove(T value) {
		boolean exist=false;
		Node prev=null;
		Node current= head;
		if(head!=null) {
			
		if(head.data.equals(value)) {
			if (head.next!=null) {
				head=head.next;
				exist=true;
			}else {
				head=null;
			}
		}
		while (current!=null) {
			if(value.equals(current.data)) {
				prev.next =current.next;
				numEle--; exist=true;
			}
			prev=current;
			current=current.next;
		}
		if (exist==false) {
			System.out.println("The element '"+value+"' doesn't exist");
		}
		
		} else {System.out.println("This list is empty");}
		
	}// displays all elements on the list
	public void displayForward() {
		
		Node<T> current =head;
		int count=0;
		//while(current!=null)
			for(int i=0;i<numEle;i++)
		{count++;
			System.out.println(current.data);
			current=current.next;
		}
				
		
	}//returns the size of the list
	public int size() {
		return numEle;
	}

}
