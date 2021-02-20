package day12;
import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		ArrayList o1=new ArrayList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
System.out.println("elements of o1"+ o1);
ArrayList o2=new ArrayList();
o2.add(5);
o2.add(6);
o2.add(7);
o2.add(8);
System.out.println("elements of o2"+ o2);
o2.retainAll(o1);
System.out.println("common elements"+o2);
o2.removeAll(o1);
System.out.println("removed"+o2);
	}

}
