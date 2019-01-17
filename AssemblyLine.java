/**
* CS 111 Section 003
* Lab Assignment 7
* Albert Nunez **/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class AssemblyLine {
	
	public static void main (String[]args){
		boolean stop=false;
// Created the queue here
		Queue<String> q = new LinkedList<String>();
		Scanner sc = new Scanner(System.in) ;
		int choice = 0;
// While loop that loops through switch cases and ends when you enter 0
		while(stop==false) {
			choice=sc.nextInt();
			//System.out.println("It's working");
		switch (choice){
		case 1: 
			q.add("tires");
			System.out.println("Tires added");
			break;
		case 2:
			q.add("radio");
			System.out.println("Radio added");
			break;
		case 3: 
			q.add("window");
			System.out.println("Windows");
			break;
		case 4:
			q.add("brake");
			System.out.println("Brakes added");
			break;
		case 5:
			//\
			q.add("seats");
			System.out.println("Seats added");
			break;
		case 6:
			q.remove();
			break;
		case 7:
// Used an iterator to print out all elments of the queue
			Iterator<String> iter=q.iterator();
			int size= q.size();
			while(!(size==0)){
			System.out.println(iter.next().toString());
			size--;
			}
		
			break;
		case 8:
// Flipped the queue using a stack
			Iterator<String> iters=q.iterator();
			Stack<String> temp = new Stack<String>();
			Queue<String> tempQ= new LinkedList<String>(); int size1= q.size();
			while(size1>0) {
				temp.push(q.remove()); size1--;
			}
			while(!(temp.isEmpty())) {
				q.add(temp.pop());
			} System.out.println("Flipped the Assembly line");
				break;
// Remove all brakes in the queue		
		case 9:
			int size3= q.size(); Queue<String> q2 = new LinkedList<String>();
			while((size3>0)) {
				String itemss = ""+q.remove().toString();
				if (itemss.equals("brake")) {
					//System.out.println("Brakes should be removed");
				}else{q2.add(itemss);}size3--;
			}  q=q2;System.out.println("All brakes are removed"); break;
		case 0:
			System.out.println("It's ended! GOOOO HOOOMEEE!");
			stop=true;
			break;
		}
		
		}
		
	}

}
