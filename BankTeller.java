import java.util.*;
public class BankTeller {

	public static void main (String[]args) {
		ArrayList<ArrayList<Integer>> db = new ArrayList();
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		System.out.println("Enter 1 for adding a new customer. Enter 2 for recording payment by an existing customer. \nEnter 3 to display the database. Enter 4 to exit.");
		int choice=sc.nextInt();
		sc.nextLine();
		while(!stop) {
			 
			switch (choice) {
			case 1:
				ArrayList<Integer> temp = new ArrayList();
				System.out.println("Please enter a loan amount");
				Integer loan = sc.nextInt();
				sc.nextLine();
				temp.add(loan);
				db.add(temp);
				break;
				
			case 2:
				boolean found=false; int ID=0;
				while (!found) {
					System.out.println("\nPlease enter customer 0ID");
					ID= sc.nextInt();
				if (ID<=db.size()) {found=true;}
				else {System.out.println("\nNo such customer found");}
				}
				System.out.println("This account was sanctioned: $"+db.get(ID).get(0));
				System.out.println("How much you want to pay"); 
				Integer amountPaid=sc.nextInt();
				db.get(ID).add(amountPaid);				
				int paid= 0;
				for(int i=1; i<db.get(ID).size(); i++) {
					paid += db.get(ID).get(i);
				}
				if (paid>=db.get(ID).get(0)) {
					System.out.println("\nYou have fully paid back the loan");
				}else {System.out.println("Payment proccessed! You have $"+
					(db.get(ID).get(0)-paid) + " remaining");}
				break;
			case 3:
				for(int i =0; i<db.size();i++) {
					System.out.println("Customer: "+db.get(i)+" Loan Amount: $"+db.get(i).get(0));
				} break;
				
			default: stop=true; System.out.println("incorrect option");
			}
			System.out.println("Enter 1 for adding a new customer. Enter 2 for recording payment by an existing customer. \nEnter 3 to display the database. Enter 4 to exit.");
			choice=sc.nextInt();
		}
	}
}
