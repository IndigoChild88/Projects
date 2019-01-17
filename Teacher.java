/**  * CS 111 Section 003. 
 *  * Lab Assignment 4 *
 *   Albert and Nunez  **/

import java.util.*;

public class Teacher extends Person{
private String department;
//Default constructor for teacher
public Teacher(){
	super();
	this.department="CCCC";
}
//Constructor for teacher
public Teacher(String lastname, String firstname, Date dob, String department){
	super(lastname, firstname, dob);
	this.department=department;
}
// Returns the Department
public String getDepartment(){
	return this.department;
}

// Checks if two constructors are equal to eachother
public boolean equals(Object a){
	return (a instanceof Teacher)&&(super.equals((Person)a));
	//(a instanceof Clock)&&(((Clock)a).hours==hours)&&(((Clock)a).minutes==minutes) ;
	
	
}
}
