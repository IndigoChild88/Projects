 /**  * CS 111 Section .003
  * Lab Assignment 3
  *  Albert Nunez  **/  

import java.util.*;

public class Clock {
	
	private int hours;
	private int minutes;

	
	public Clock (int hours_in, int mins_in){
		//Constructor that takes in the hour and the minutes
		hours=hours_in;
		minutes=mins_in;
	}
	public Clock() {
		hours=0;
		minutes=0;
	}
	public int getHours(){
		//Getter for hours
		return hours;
	}
	
	public int getMin(){
		//Getter for Min
		return minutes;
	}
	
	public String toString(){
		// turns the time into the string and returns
		int h; int m; String pm="am";
		m=minutes;
		if(hours>12){	
		h=hours%12;
		pm="pm";
		}else{h=hours;}
		if(hours==0){
			h=12;
			pm="am";
		}
		if(m==0) {
			pm="0"+pm;
		}
		
		
		return h+":"+m+pm;
	}
	public boolean equals(Object a){
		// Check the instance and variables aree equals
		return (a instanceof Clock)&&(((Clock)a).hours==hours)&&(((Clock)a).minutes==minutes) ;
	}
	public int compareTo(Object a){
		//Compare to objects
		int indi=1;
		if (equals(a)){
			indi=0;
		} else if (((Clock)a).hours==hours){
			if (((Clock)a).minutes>minutes){
			indi=-1;
			}else indi=1;
		}
		else if (((Clock)(a)).hours>hours){
			indi=-1;
		}
		return indi;
		
	}
	
	
}
