package day13;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "Employee [id="+id+",name="+name+"]";
		// TODO Auto-generated constructor stub
	}
public int compareTo(Employee o){
	if(id==o.id)
		return 0;
	else if(id>o.id)
		return -1;
	return 1;
}

}
public class UserDefinedDemo {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"sam"));
		emplist.add(new Employee(2,"sama"));
		emplist.add(new Employee(3,"samara"));
		System.out.println("elements are "+emplist);
		for(Employee e:emplist)
		{
			System.out.println(e.id+" "+e.name);
		}
			Collections.sort(emplist);
			System.out.println("====after sorting===");
			for(Employee e:emplist)
			{
				System.out.println(e.id+" "+e.name);
			}
			
		}
	
}
