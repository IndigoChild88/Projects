/**
* CS 111 Section 003
* Lab Assignment 12 
* Albert Nunez **/
public class ArrayRecursion {
private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {4, 2, 3, 9, 4, 2, 6, 89, 12, 11};
		System.out.println("This is the array: "+listArray(v));
		System.out.println(countElements(v,0)+"\n");
		count=0;
		
		int[] z = {25, 33, 3, 21, 69, 69, 48, 89, 22, 77};
		System.out.println("This is the array: "+listArray(z));
		System.out.println(countElements(z,6)+"\n");
		count=0;
		
		int[]  y= {55,86,97,42,123,33,6545,68};
		System.out.println("This is the array: "+listArray(y));
		System.out.println(countElements(y,5));
		
	}
	// recursive method for finding numbers divisible by 3
	public static int countElements(int [] array, int position) {
		if (position<=array.length-1) {
			if(array[position]%3==0) {
			return count++ + countElements(array, position+1);
			}else{
				countElements(array, position+1);
			}
		}
			
		return count;
	}
	// List out the array values with modulo operations
	public static String listArray(int[] array) {
		String temp="| ";
		for (int i=0; i<array.length; i++) {
			int t = array[i]%3;
			temp+=""+array[i]+" % 3 ="+ t +" | ";
		}
		return temp;
	}
	
}
