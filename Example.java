import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Example {

	public static void main (String[]args){
		LinkedList<String> names = new LinkedList<String>();
		names.add("Tom");
		names.addFirst("Harry");
		System.out.println(names.size());
		
		Iterator<String> iter =names.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Queue<String> q = new LinkedList<String>();
		q.add("Tom");
		q.offer("Harry");
		q.add("Sam");
		
	//	iter=q.listIterator();
	}
	
}
