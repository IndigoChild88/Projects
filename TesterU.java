/**
* CS 111 Section 003
* Lab Assignment 10 
* Albert Nunez **/
public class TesterU {
	public static void main (String[]args) {
		//Created two different list types
Unordered<String>list=new Unordered<String>();
// Used all the methods from the created generic class
list.add("Shakira");
list.add("Zendaya");
list.add("Khalani");
list.add("Jessica Williams");

list.remove("Your sister");
list.remove("Khalani");

System.out.println("Size of the list: "+list.size());
list.displayForward();
System.out.println("--------------------------------------------------");
Unordered<Double>list2=new Unordered<Double>();
list2.add(44.0);
list2.add(35.0);
list2.add(25.0);
list2.add(12.0);

list2.remove(25.0);
list2.remove(69.0);
System.out.println("Size of the list: "+list2.size());
list2.displayForward();
} 
}