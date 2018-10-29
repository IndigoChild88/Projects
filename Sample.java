import java.util.*;
public class Sample {
	public static void main (String[] args) {
		ArrayList<String> al = new ArrayList();
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of stores");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			ArrayList<String> temp = new ArrayList();
			groceryList.add(temp);
			System.out.println("\nEnter the items you want to buy from the store");
			String input = sc.nextLine();
			String[] splitted = input.split(" ");
			for (int j=0; j<splitted.length; j++) 
				temp.add(splitted[j]);
				groceryList.add(temp);
		}
				for(int i=0; i<groceryList.size(); i++) {
				ArrayList<String> curr = groceryList.get(i);
				for( int j=0; j< curr.size(); j++) {
					System.out.println(curr.get(j)+" ");
					System.out.println();
				}
				groceryList.get(0).remove(0);
				}
				

		
	}
}
