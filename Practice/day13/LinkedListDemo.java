package day13;

import java.awt.List;
import java.util.LinkedList;

public class LinkedListDemo {
@SuppressWarnings("unchecked")
public static void main(String[] args){
	LinkedList l=new LinkedList();
	l.add(2);
	l.add(5);
	l.addFirst(10);
	l.addLast(7);
	
	l.add(25);
	System.out.println("linkesd list" +l);
	l.removeFirst();
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
}
}
