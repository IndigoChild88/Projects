 /*  * CS 111 Section 003  
  * * Lab Assignment 5 * 
  * Albert Nunez  **
  */
import java.util.Arrays;

public class AnyArray<T> {
private T[] arr;
private int size;

//Default constructor
public AnyArray() {
	arr=null;
}///Takes an array of data type T
public AnyArray(T[] input) {
	arr=input;
}//Gets the data type from the element of the array
public T getIth(int i) {
	T t=null;
	if(i>=0&&i<arr.length) {
		t=arr[i];
	}return t;
}// Finds location of the data in the array
public int findLocation(T query) {
	int F=-1;
	for(int i=0; i<arr.length; i++) {
		if (query.equals(arr[i])) {
			F=i;
		}
	}return F;
}// Prints out the array
public void printArray() {
	String str =Arrays.toString(arr);
	str=str.substring(1, str.length()-1);
	System.out.println(str);
}//ToString method
public String toString() {
	return "This list has "+arr.length+" elements with the first item: "+
getIth(0)+" and the last item: "+ getIth(arr.length-1);
}
}
