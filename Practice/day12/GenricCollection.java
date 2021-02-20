package day12;
import java.util.ArrayList;
public class GenricCollection {
public static void main(String[] args){
	ArrayList o1=new ArrayList();
	o1.add(1);
	o1.add("Sachin");
	o1.add(true);
	o1.add(23.45);
	ArrayList<Integer> o2=new ArrayList<Integer>();
	o2.add(2);
	
	ArrayList<String> o3=new ArrayList<String>();
	o3.add("ram");
	o3.add("Sachin");
  ArrayList<Employee> emplist=new ArrayList<Employee>();
	emplist.add(new Employee(1,"rahul"));
	emplist.add(new Employee(2,"hul"));
	
}
}
class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}