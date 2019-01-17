
public class Human {
	
	private String name;
	private Date dob;
	
	public Human(){
		name="AAA";
		dob= new Date();
	}
	public Human(String name_in, Date dob_in){
		
	}
	public String toString(){
		return "Name: "+ name +"  DOB: "+dob.toString();
	}
}
