package day13;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args){
	Stack  s=new Stack();
	s.push(1);
	s.add(2);
	System.out.println(s);
	System.out.println("Top Element" +s.peek());
	System.out.println("Remove Top Elment"+s.pop());
	System.out.println("after pop"+s);
	
	
}
}
