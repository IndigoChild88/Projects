/**
* CS 111 Section 003
* Lab Assignment 10
* Albert Nunez **/
import java.util.*;
import java.lang.*;
public class CircularQueue<T> {

	private static class Node<T> { 
	private T data; private Node<T> next; 
	 
	private Node (T d){     data = d;     next = null;  } 
	 
	private Node (T d, Node<T> ref){    
		data = d;    
		next = ref;  }   
	}
	
	private Node <T> tail;
	private int numEle;
	public CircularQueue(){
		tail= null;
		numEle=0;
	}
	//Add element at the beginning 
	public void enqueue(T value) {
		Node<T> newNode=new Node<T>(value);
		if (numEle==0) {
			tail=newNode;
			tail.next=tail;
		}
		else {
	newNode.next=tail.next;
	tail.next=newNode;
	tail=newNode;
	} 	numEle++;
		}
	//Removes element from the back
	public void dequeue() throws QueueEmpty {
		if (numEle<=0) {
			throw new QueueEmpty("The Queue is empty");
		}else if(numEle==1){
			tail=null;
			numEle--;
		}
		else {
		Node<T> temp=tail.next;
		tail.next=temp.next;
		numEle--;
		}
	}
	//Displays all elements in the array
	public void display() {
		
		if (numEle==0) {
			System.out.println("The Queue is empty");
		}
		else {
		Node<T> temp= tail.next;
		System.out.println("Element in the queue"+"/n-------------------------------------------------------");
		for(int i=0; i<numEle-1; i++) {
			
		System.out.println(temp.data+"");
		temp=temp.next;
		}
		System.out.println("--------------------------------------------------");
	}
	}
	//Look at the top of the Queue
	public T peek() {
		return tail.next.data;
	}
	//Prints the size of the Queue
	public int size() {
		return numEle;
	}
}

