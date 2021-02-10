
public class Employeee {
	 String firstName; 
	String lastName;
	public Employeee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString(){  
		  return firstName+" "+lastName;  
		 }  
	 public static void main(String args[]){  
		   Employeee e1=new Employeee("Anshuman","Kundra");  
		   System.out.println(e1);
	 }
}
