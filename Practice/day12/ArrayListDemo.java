package day12;

import java.util.ArrayList;

public class ArrayListDemo {
@SuppressWarnings("unchecked")
public static void main(String[] args){
	ArrayList o=new ArrayList();
	ArrayList o1=new ArrayList(30);
	System.out.println("Size of arrayList"+o.size());
System.out.println("Elements of ArrayList"+o);
o.add(1);// i=1;i=-1
o.add("sam");
o.add('c');
o.add(23.45);
o.add(null);
o.add('c');
o.add(23.45);
o.add(null);
System.out.println("Size of arraylist after adding; "+o.size());
System.out.println("Elements of arraylist: "+o);
System.out.println("Exists: "+o.indexOf(1));
System.out.println("Exists: "+o.indexOf("c"));
System.out.println("Elements at index 2: "+o.get(2));
System.out.println("=========remove============");
o.remove("sam");
System.out.println("after removing "+o);
}
}
