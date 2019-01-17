
/**
* CS 111 Section 003
* Lab Assignment 10
* Albert Nunez **/
public class Tester2 {
	public static void main (String[]args) throws QueueEmpty {
		//Created two different list types
CircularQueue<String>list=new CircularQueue<String>();
// Used all the methods from the created generic class

try {
	list.dequeue();
} catch (QueueEmpty e) {
	System.out.println(e.getMessage());
}

list.enqueue("HAAAAAA noooooo");
list.enqueue("Your mom");
list.enqueue("Your sister");
list.enqueue("Your cousin");

list.dequeue();

System.out.println("Size of the list: "+list.size());
list.display();


CircularQueue<Double>list2=new CircularQueue<Double>();
list2.enqueue(44.0);
list2.enqueue(35.5);
list2.enqueue(23.1);
list2.enqueue(69.9);

list2.dequeue();
System.out.println("Size of the list: "+list2.size());
list2.display();
} 
}
