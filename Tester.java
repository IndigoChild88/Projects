/**
* CS 111 Section 003
* Lab Assignment 11 
* Albert Nunez **/
import java.util.*;

public class Tester {
public static void main(String[]args) {
	//Created a array list
MyArrayList<String> chicken = new MyArrayList<String>();
//Add method to add the elements
chicken.add("Egg");
chicken.add("hen");
chicken.add("Kim Jong Un");
chicken.add("Tourist");
chicken.add("Popeye's");
//displays all elements in array
chicken.display();
System.out.println("It is full?: "+chicken.full());

System.out.println("The size of the list: " +chicken.size());
chicken.remove("Egg");
chicken.remove("Tourist");
chicken.display();
System.out.println("\nThe size of the list after remove: " +chicken.size());

//Created a array list
MyArrayList<Integer> numba = new MyArrayList<Integer>(7);

numba.add(5);
numba.add(32);
numba.add(69);
numba.add(44);
numba.add(255);
numba.add(1);
numba.add(12);
//displays all elements in array
numba.display();
System.out.println("The size of the list: " +chicken.size());
//Clear removes all elements from the array
numba.clear();
numba.add(58);
numba.display();
System.out.println("The size of the list after remove: " +numba.size());
System.out.println("It is full?: "+numba.full());
System.out.println("Is it empty?: "+numba.empty());

}
}