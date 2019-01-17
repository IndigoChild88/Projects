import java.util.Scanner;
import java.util.Stack;
public class ExamTest{
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String po; 
  //public static boolean isPla (String po) {
  // boolean temp = false;
   int middle;     String right="",Left="";
   Stack <Character> pal1 = new Stack<Character> ();
   Stack <Character> pal2 = new Stack<Character> ();
   
   System.out.println(" enter palindrome");
   Scanner in = new Scanner (System.in );
   String pal = "racecar";
   middle = pal.length()/2 ;
   int y = pal.length()-1;
   int i ;
   for ( i=0;i<middle-1; i++);{
   
   pal1.push(pal.charAt(i));
   pal2.push(pal.charAt(y));
  // i++;
   y--;
  }
     i=0;
 boolean check = true;
 for(i=0;i<pal2.size();i++ ){
     if(!pal1.pop().equals(pal2.pop())){
    	 
         check=false;
     }
 }
 if (check){
 
 int v =7/2;
 int z = 6/2;
 
 System.out.println(" It is  palindrome "+Left+" "+right+" This is the stack: "+pal1+"   pal2" +pal2);}
 else{
 System.out.println("not palindrome: "+Left+"  "+pal1);}
}
}
