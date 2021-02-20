package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItertorDemo {
	public static void main(String[] args){
		ArrayList o=new ArrayList(30);
		o.add(1);
		o.add(2);
		o.add(3);
		o.add(4);
		System.out.println("Elements are"+o);
		Iterator it=o.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("----------------ListItrator-----------");
	ListIterator lstit=o.listIterator();
	System.out.println("forward Direction");
	while(lstit.hasNext()){
		System.out.println(lstit.next());
	}
	System.out.println("backward Direction");
	while(lstit.hasPrevious()){
		System.out.println(lstit.previous());
	}
	}
}
