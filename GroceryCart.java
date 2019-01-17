 /*  * CS 111 Section 003  
  * * Lab Assignment 5 * 
  * Albert Nunez  **
  * 
  */
import java.util.*;
public class GroceryCart {
//data members
	private static String[] names;
	private static Double[] prices;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items are you planning to buy today?");
		
		boolean valid=false;
		int numItems=0;
		//loops around if a value isn't a int
	while(valid==false){	try {
		 numItems=sc.nextInt();	
		 valid=true;
	}	catch (Exception e){
			System.out.println("Invalid Please enter a int value");
			valid=false; String str=sc.next();
		}
	}
		names=new String[numItems];
		prices=new Double[numItems];
		String conti=""; String Item="";
		double Price=0;
		//for loop to take in values for the arrrays
		for(int i=0; i<numItems; i++) {
			System.out.println("Enter the name of the item");
			Item=sc.next();
			names[i]=Item.toLowerCase();
			boolean valid2=false;
			System.out.println("\nEnter the Price of the item");
			//Loops around if value isn't a valid double
		while(valid2==false){	try {
			Price=sc.nextDouble();
			prices[i]=Price;
			valid2=true;}
			catch (Exception e){
				System.out.println("Invalid Please enter a DOUBLE value");
				valid2=false; String str=sc.next();
			}
		}
		}
		AnyArray<String> nameList = new AnyArray<String>(names);
		AnyArray<Double> priceList = new AnyArray<Double>(prices);
		
		System.out.println(nameList.toString());
		System.out.println(priceList.toString());
		System.out.println("\nPlease Enter an item on the list");
		
		String choice=sc.next();
		// Checks if the Item your searching for is in the list
		int ith=nameList.findLocation(choice.toLowerCase());
		if (nameList.findLocation(choice.toLowerCase())==-1) {
			System.out.println("Item not found");
		}
		else {
			System.out.println("The price of "+choice+" is: "+
					priceList.getIth(ith));
		}
	}
	
	}
