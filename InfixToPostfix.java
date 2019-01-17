/**  * CS 111 Section 003. 
 *  * Out lab assignment 2*
 *   Albert and Nunez  **/
import java.util.*;

public class InfixToPostfix {
	////////////////////////////Exception handlers
	public static class InvalidParenthesis extends Exception {
		public InvalidParenthesis(String e) {
			super(e); System.out.println(e+"\nNot equal amount of open and closed parentheses");
		}	
	}
	public static class InvalidAmountOfOperands  extends Exception {
		public InvalidAmountOfOperands(String e) {
			super(e); System.out.println("Improper amount of operands");
		}	
	}
	public static class TooManyVariables extends Exception {
		public TooManyVariables(String e) {
			super(e); System.out.println("There are too any variables");
		}	
	}
	////////////////////////////////////////////////////////////////////////////////////////
	//Checks the count of Parenthesis and returns true or false with thrown exceptions
	public static boolean checkParenthesis(String expr) throws InvalidParenthesis {
		boolean valid =false; int count1 = 0,count2=0;
		for(int i=0;i<expr.length();i++) {
			if(expr.charAt(i)=='(') {count1++;}
			else if(expr.charAt(i)==')') {count2++;}
	}  if(count1==count2) { valid=true;
	} else if (count1>count2) { valid = false; throw new InvalidParenthesis("Expression misssing a open '(' "); 
	}else if (count2>count1) {valid = false; System.out.println("Count1: "+count1+"  Count2: "+count2);
	throw new InvalidParenthesis("Expression is missing closed ')'"); 
	}return valid;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	///// Checks to see if there is acceptable amount of variables and operands
	public static boolean checkOperands(String expr) throws TooManyVariables, InvalidAmountOfOperands {
		boolean valid=false; int count1=0, count2=0;
		for(int i=0; i<expr.length(); i++) {
			if(Character.isLetter(expr.charAt(i))) {
				count1++;
			}else if (Operands(expr.charAt(i))) {
				count2++;
			}
		}
		if(count1-1==count2) {
			valid=true;
		}
if (count2!=count1-1) {
			if(count2>count1-1) {
				valid=false; throw new InvalidAmountOfOperands("There are too many operands");
			}else if (count2<count1-1) {
				 valid=false; throw new InvalidAmountOfOperands("There is not enough amount of operands");
			}
		}
		
		return valid;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[]args) throws InvalidParenthesis, TooManyVariables, InvalidAmountOfOperands {
		String expression ="";
		while(!expression.equals("5")) {
		System.out.println("\nPlease enter a INFIX expression to be evaluated \nEnter 5 to stop");
		Scanner sc = new Scanner(System.in);
		expression=sc.nextLine(); String END="";
		
		Stack<Integer> intStack=new Stack<Integer>();
		String[] tokens=expression.split(" ");
		String token="";
		Stack<String> Ops=new Stack<String>();
		for(int i =0; i< tokens.length; i++) {
		 token += tokens[i];}
		Queue<Character> infixE = new LinkedList<Character>();
		for(int i=0; i<token.length();i++) {
			infixE.add(token.charAt(i)); 
		}

		if(checkParenthesis(token)&&checkOperands(token)) {
			String Finished="",Fin=""; Queue<Character> temp = new LinkedList<Character>(); temp=convertToPostfix(infixE);
			while (!temp.isEmpty()) {
			//	char t =temp.peek();
				//if(t!='(')
				Finished+=temp.poll();
			} 
			for(int i=0; i<Finished.length();i++) {
				if(Finished.charAt(i)!='(') {
					Fin+=Finished.charAt(i);
				}
			}
			
			
			System.out.println("The PostFix expression is: "+Fin);
			//System.out.println("Test: "+token);
			//System.out.println("TEST parans: " +checkParenthesis("(a+b))"));
			
			
		}

	}
	}
	
////////////////////////////////////////////////////////////////////////////////////
/// Algorithm from the book to convert infix to postfix
public static Queue<Character> convertToPostfix(Queue infix) {
//Queue<String> operatorStack = new LinkedList<String>();
Stack<Character> operatorStack = new Stack<Character>();
Queue<Character> postfix = new LinkedList<Character>();
String Carry="";
while (!infix.isEmpty()) {
	
	char nextCharacter = (char) infix.poll();
	///  This allows to check if the next variable is in the alphabet
	/// If it is then it be added to the postfix queue and skip the switch case
	// If not it'll run through the switch case and loop again
	if(Character.isLetter(nextCharacter)) {
		postfix.add(nextCharacter);
	}
	switch (nextCharacter) {
	case '^':
		operatorStack.push(nextCharacter);
		break;
	 case '+': case '-':   case '/': case '*':
		while(!operatorStack.isEmpty()&&(getPrec(nextCharacter)<=getPrec(operatorStack.peek()))) {
			postfix.add(operatorStack.peek());
			operatorStack.pop();
		}
		operatorStack.push(nextCharacter);
		break;
	case '(':
		operatorStack.push(nextCharacter);
		break;
	case ')'://Stack isn't empty if the infix expresion is valid
		char topOperator = operatorStack.pop();

		while(topOperator != ')' && !operatorStack.isEmpty()) {
			postfix.add(topOperator);
			topOperator = operatorStack.pop();
		}
		if(operatorStack.isEmpty()) {
			Carry+=topOperator;
		}
		break;
		default: break;
		
	}
}
while(!operatorStack.isEmpty()) {
	char topOperator = operatorStack.pop();
			postfix.add(topOperator);
         } 
for(int i=0; i<Carry.length(); i++) {
	postfix.add(Carry.charAt(i));
}
return postfix;
}
//////////////////////////////////////////////////////////////////////
/// Has a ranking system for predecesors and returns an in depending on how I rank it.
public static int getPrec(char c) {
	int choice =0;
	if(c=='*'||c=='/') {
		choice = 2;
	}
	else if (c=='+'|| c=='-') {
		choice = 1;
	}
	else if(c=='(') {
		choice=0;
	}
		
		return choice;
}
///////////////////////////////////////////////////
/// Checks to see if a charactor is an operand, returns true or false
public static boolean Operands(char c) {
	boolean Equals=false;
	if (c=='+'||c=='-'||c=='/'||c=='*'||c=='^') {
		Equals=true;
	}return Equals;
}
}


