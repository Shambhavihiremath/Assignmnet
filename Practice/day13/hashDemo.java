package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		HashSet h=new HashSet();
		h.add(2);
		h.add(5);
		h.add(2);//no duplicate
		System.out.println("hashset"+h);
		LinkedHashSet lh=new LinkedHashSet();//link+hash
		lh.add(3);
		lh.add(8);
		lh.add(3);//no duplicate
		System.out.println("LinkedHashset"+lh);
//own order
		
		System.out.println(" note:TreeSet will come in sorted order");
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(16);
		t.add(8);
		System.out.println("treeset"+t);
		
		TreeSet t1=new TreeSet();
		t1.add(new String("hello"));
		t1.add("hi");
		t1.add("apple");
		System.out.println(t1);//alpha order
		
		TreeSet<StringBuffer> t2=new TreeSet<StringBuffer>();
		t2.add(new StringBuffer("hello"));
		t2.add(new StringBuffer("PAL"));
		System.out.println(t2);//due to jdk version i shows error
		
	}
}