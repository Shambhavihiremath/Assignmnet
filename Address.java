class AddressDemo {
private String addressLine;
private String city;

public void setaddressLine(String string){
	addressLine=string;
}
public void setcity(String string){
	city=string;
}
public String getaddressLine(){
	return addressLine;
}
public String getcity(){
	return city;
}

}

public class Address{
	public static void main(String[] args){
		AddressDemo add=new AddressDemo();
		add.setaddressLine("Ist Main HSR Layout");
		add.setcity("Bangalore");
		System.out.print(add.getaddressLine()+",");
		System.out.print(add.getcity());
	}

}
