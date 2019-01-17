 /**  * CS 111 Section 003  *
  *  Lab Assignment 6 * 
  *  Albert and Nunez  **/   

import java.util.*;
public class StacksApplication {
	
	
	
	
	
public class InvalidParentheses extends Exception {
	public InvalidParentheses(String e) {
		super(e); System.out.println("Not equal amount of open and closed parentheses");
	}	
}
public class InvalidAmountOfOperands  extends Exception {
	public InvalidAmountOfOperands(String e) {
		super(e); System.out.println("Improper amount of operands");
	}	
}
public class TooManyVariables extends Exception {
	public TooManyVariables(String e) {
		super(e); System.out.println("There are too any variables");
	}	
}
	public static void main(String[] args) {
		System.out.println("Enter 1 to evaluate a prefix expression  \nEnter"
				+ " 2 to evaluate a postfx expression");
		Scanner sc= new Scanner(System.in);
		int choice=0; boolean valid=false;
		//This makes sure that your choice is a valid input and loops again if otherwise
		while(!valid) {
			try { choice=sc.nextInt();
			if (choice==1||choice==2) { valid=true;}
			else System.out.println("\nEnter 1 to evaluate a prefix expression  \nEnter"+ " 2 to evaluate a postfx expression");
			}catch(Exception e) {System.out.println("Please enter a valid integer"+
					"\nEnter 1 to evaluate a prefix expression  \nEnter"+ " 2 to evaluate a postfx expression");
					String str=sc.next();
			}}try {
		if (choice==1) {
			System.out.println("Enter the Prefix Expression");
			String e = sc.nextLine();
			String expression =sc.nextLine();
			System.out.println(expression);
			evalPrefix(expression); 
			
		}		else if (choice==2) {
			System.out.println("Enter the Postfix Expression");
			String e=sc.nextLine();
			String expression =sc.nextLine();
			System.out.println(expression);
		    evalPostfix(expression);
		}
			}catch(Exception e) {System.out.println("The expression cannot be evaluated" + 
		"\nPlease make sure you add spaces or if your expression is valid");
			}
//evalPrefix("+ 9 * 2 6");
//evalPostfix("2 3 1 * + 9 -");

	}
	//Evaluates Prefix expression and returns the answer;
	public static void evalPrefix(String expression) {
		Stack<Integer> intStack=new Stack<Integer>();
		String[] tokens=expression.split(" ");
		Stack<String> Ops=new Stack<String>();
		
		for(int i =0; i< tokens.length; i++) {
			String token = tokens[i];
			
			try {
				int operand= operand=Integer.parseInt(token);
				intStack.push(operand);
			}catch(NumberFormatException e){
				System.out.println("Operator found:  "+ token);
				Ops.push(token);
			}
		}
		int[] int1 = new int[10];
	
		System.out.println(expression);

		int a=intStack.pop();
		int b=intStack.pop(); int prev=0;
		// Uses operators and applies them between two numbers.
		while(!Ops.isEmpty()) {
		
			String RedOps=Ops.pop();
			if(RedOps.equals("+")) {
				prev=a+b; 	//System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  ADD");
				//System.out.println(a+""+b);
			}else if(RedOps.equals("-")) {
				prev=a-b;
			}else if(RedOps.equals("*")) {
				prev=a*b; 	//System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  Multi");
			}else if(RedOps.equals("^")) {
				prev=a^b;
			}else if(RedOps.equals("/")) {
				prev=a/b;  //System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  Divide");
			}
				a=prev; 	
				if (!intStack.isEmpty()) {b=intStack.pop();}
		}
		System.out.println("The value of this Prefix expression: "+prev);
	}
	/////////////////////////////////////////////////////////////////////
	// Evaluates the Postfix expression
	public static void evalPostfix(String Postfix) {

		Stack<Integer> intStack=new Stack<Integer>();
		String[] tokens=Postfix.split(" ");
		Stack<String> Ops=new Stack<String>();
		int prev=0; int a=0; boolean oneTime=false;
		//System.out.println(Postfix);
		// Uses operators and applies them between two numbers.
		for(int i =0; i< tokens.length; i++) {
			String token = tokens[i];
			try {
				int operand= operand=Integer.parseInt(token);
				intStack.push(operand);
			}catch(NumberFormatException e){
				//System.out.println("Operator found:  "+ token);
				Ops.push(token);
			}
			if (oneTime==false)a=intStack.pop(); oneTime=true;
			if(!Ops.isEmpty()) {
				
				int b=intStack.pop(); 
			String RedOps=Ops.pop();
			if(RedOps.equals("+")) {
				prev=a+b; 	//System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  ADD");
				//System.out.println(a+""+b);
			}else if(RedOps.equals("-")) {
				prev=a-b;  // System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  SUB");
			}else if(RedOps.equals("*")) {
				prev=a*b; 	//System.out.println("prev:"+prev+" a:"+a+" b:"+b+"  Multi");
			}else if(RedOps.equals("^")) {
				prev=a^b;
			}else if(RedOps.equals("/")) {
				prev=a/b;
			}
				a=prev;
		} }
		int[] int1 = new int[10]; System.out.println("The value of the Prefix expression: "+prev);
	}
	// This returns the reverse order of a Integer stack
	public static Stack<Integer> reverse(Stack<Integer> rev) {
		int len = rev.size(); Stack<Integer>temp=new Stack<Integer>();
		for (int i=0; i<len; i++) {
			temp.push(rev.pop());
		}
		return temp;
	}
	// This returns the reverse order of a String stack
	public static Stack<String> reverseS(Stack<String> rev) {
		int len = rev.size(); Stack<String>temp=new Stack<String>();
		for (int i=0; i<len; i++) {
			temp.push(rev.pop());
		}
		return temp;
	}
	public static boolean isParens(String exp) {
		boolean valid =false; int count1 = 0,count2=0;
		for(int i=0;i<exp.length();i++) {
			if(exp.substring(i).equals("(")) {count1++;}
			else if(exp.substring(i).equals(")")) {count2++;}
	}  if(count1==count2) { valid=true;
	}return valid;}
}
