public class Testing{
  public static void main(String []args){
     
   
    Teacher t1=new Teacher("Carrano","Prichard",new Date(05,04,1954),"ComputerScience");
    System.out.println("Printing t1 " + t1.toString());
    
    Teacher t2=new Teacher();
    System.out.println("Printing t2 " + t2.toString());
   
    System.out.println("Comparing t1 to t2: "+t1.equals(t2));
    
    Student s1=new Student();
    System.out.println("Printing s1 " + s1.toString());
    
    Student s2=new Student("Jackson","Michael",new Date(05,04,2001),4,700000001,t1);
    System.out.println("Printing s2 " + s2.toString());
    
    System.out.println("Comparing s1 and s2:"+ s1.equals(s2));
    
 
       
 
  }
}
