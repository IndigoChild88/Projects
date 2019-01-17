/**
* CS 111 Section 003
* Lab Assignment 11 
* Albert Nunez **/
public class MyArrayList<T> {
	Object[] arr;
	int index;
	int ArraySize;
	private static final int maxSize=5;
	//Creates a default array list
	MyArrayList(){
		arr= (T[]) new Object[maxSize];
		index=0;
		ArraySize=maxSize;
	}
	//Creates a custom sized array list
	MyArrayList(int size_input){
		arr=(T[]) new Object[size_input];
		index=0;
		ArraySize=size_input;
		System.out.println("\nThe max size of the Array is: "+ArraySize);
	}
	//Displays all elements in the array
	public void display() {
		System.out.println("-----------------------------DISPLAY---------------------------------------");
		for(int i=0; i<index;i++) {
			System.out.println("Element "+i+": "+ arr[i]);
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	//Checks to see if the array is empty
	public boolean empty() {
		return arr[0]==null;
	}
//Removes the generic value from an array
	public void remove (T value) {
		Object[] temp =(T[]) new Object[ArraySize];
		int tempIndex=0;
		if (!(arr[0]==null)) {
			for (int i=0; i<index;i++) {
				if(!(arr[i]==(value))) {
				temp[tempIndex]=(T)arr[i];
				//System.out.println("Element "+i+" "+arr[i]+" for temp: "+temp[tempIndex]);
				tempIndex++;
				}
			}index--;
			arr=temp;
		}
	else if(arr[0]==null) {
			System.out.println("\nThis list is empty");
		}
	else {
		System.out.print("There is no element: "+value);
	}
	}
	//Adding an item to an array
	public void add(T item) {
		if(!full()) {
		arr[index]=item;
		index++;}
		else {
			System.out.println("The list is full");
		}
	}
	//Removes Restarts the array index at zero
	public void clear() {
		index=0;
	}
	//Checks if the array is full
	public boolean full() {
		return (index)==ArraySize;
	}
	//Returns the size of the array
	public int size() {
		return index;
	}
}
