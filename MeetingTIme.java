 /**  * CS 111 Section .003
  * Lab Assignment 3
  *  Albert Nunez  **/  
import java.util.*;
public class MeetingTIme {
	//public static Clock myTime=new Clock(11,00);

	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		int min=0, hour=0;

		Clock myTime = new Clock(11,00);
		boolean valid=false;boolean valid1=false;
		while(valid ==false){
			//Enter your friends time
		try{
			System.out.println("Enter the hour of your Friends ETA");
			 hour =input.nextInt();
		
			if ((hour<0)||(hour>24)){
				throw new IllegalArgumentException();
			
			
			}else valid=true;
		}catch(IllegalArgumentException e){
			System.out.println("You entered incorrect Value! Try again"); 
		}}
		
		while(valid1 ==false){
		try{
			System.out.println("Enter the minutes of your Friends ETA");
			 min =input.nextInt();
		
			if ((min<0)||(min>60)){
				throw new IllegalArgumentException();	
			}else valid1=true;
		}catch(IllegalArgumentException e){
			System.out.println("You entered incorrect Value! Try again"); 
		}}
		
		Clock friendTime=new Clock(hour,min);
		
		System.out.println("ETA of friends time is: "+friendTime.toString());
	System.out.println("");
	ETA(myTime.compareTo(friendTime), myTime, friendTime);
	}
	
	public static void ETA(int Z, Clock myTime, Clock friendTime){
		//Prints out the results of the time and who is going to arrive first.
		System.out.println(Z);
		if(Z==0){
			System.out.println("You will arrive at the same time");
			System.out.println("Your time:"+myTime.toString()+" Your friends time: "+friendTime.toString());
		}else if (Z==-1){
			System.out.println("You will arrive BEFORE your friend");
			System.out.println("Your time:"+myTime.toString()+" Your friends time: "+friendTime.toString());
		}
		else{
			System.out.println("You will arrive AFTER your fiend");
			System.out.println("Your time:"+myTime.toString()+" Your friends time: "+friendTime.toString());
		}
	}
	
	
}
