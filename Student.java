/**  * CS 111 Section 003. 
 *  * Lab Assignment 4 *
 *   Albert and Nunez  **/
public class Student extends Person {
	private double gpa;
	private int studentID;
	private Teacher advisor;
	
	//// Constructor for student for defaullt settings
	public Student(){
		super();
		this.gpa=0.0;
		this.studentID=0;
	}
/// Constructor to set variables
	public Student(String lastname, String firstname, Date dob, double gpa, int studentID, Teacher adv){
		super(lastname,firstname,dob);
	}
	// returns student id
	public int getStudent(){
		return studentID;
	}
	// returns gpa
	public double getGpa(){
		return gpa;
	}
	//return advisor teacher constructor
	public Teacher getaAdvisor(){
		
		return advisor;
		
	}
	// Checks if two constructors are equal to each other
	public boolean equals(Object a){
		return (a instanceof Student)&&(super.equals((Person)a));
		//(a instanceof Clock)&&(((Clock)a).hours==hours)&&(((Clock)a).minutes==minutes) ;
		
		
	}
}
