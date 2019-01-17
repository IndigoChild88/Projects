/**  * CS 111 Section 003. 
 *  * Lab Assignment 4 *
 *   Albert and Nunez  **/

import java.util.Calendar;
import java.util.*;

public class Person{
  
  private String firstName;
  private String lastName;
  private Date dob;
  //Added int get age
  private int age;
  //null contructor
  public Person(){
    this.firstName="AAAA";
    this.lastName="BBBB";
    this.dob=new Date();
  }
  
  //contructor which takes firstname,lastname and age
  public Person(String last,String first,Date dob){
    this.firstName=first;
    this.lastName=last;
    this.dob=dob;
    
  }
  // Gets the year you were born and uses the current time to figure out your age
public int getAge(){
	String year=dob.toString().substring(dob.toString().length()-4,dob.toString().length());
	int temp=Integer.parseInt(year);
	System.out.println("The year you were born was " +year +" The current year is  "+Calendar.getInstance().get(Calendar.YEAR));
	int temp1=Calendar.getInstance().get(Calendar.YEAR)-temp;
	return temp1;
	
}
//Checks if the variables of two constructors are equal to eachother
public boolean equals(Object a){
	return (a instanceof Person)&&(((Person)a).dob.equals(dob))&&(((Person)a).firstName.equals(firstName))&&(((Person)a).lastName.equals(lastName));
	//(a instanceof Clock)&&(((Clock)a).hours==hours)&&(((Clock)a).minutes==minutes) ;
	
	
}
//Converts constructor values into string
public String toString(){
	return "First Name: "+firstName+"  Last Name: "+lastName+"  Age: "+getAge();
	
}

  //getter for DateOfBirth
  public Date getDOB(){
    return this.dob;
  }
  
  //Getter for first name
  public String getFirst(){
    return this.firstName;
  }
  
  //Getter for last name
  public String getLast(){
    return this.lastName;
  }
    
}
