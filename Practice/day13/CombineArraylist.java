package day13;

import java.util.ArrayList;
import java.util.Collections;

public class CombineArraylist {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();  
	list.add("Aarthi");  
	list.add("Abhay");
	list.add("Deepa");
	list.add("Dharshan");
	list.add("saritha");
	System.out.println("Elements of array list"+list);
	ArrayList<String> list1=new ArrayList<String>();  
	list1.add("Anjali");  
	list1.add("Nikhil");
	list1.add("Deepa");
	list1.add("Aarthi");
	list1.add("Pavan");
	System.out.println("Elements of array list"+list1);
   list1.removeAll(list);
   System.out.println(list);
	list1.addAll(list);
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	
	} 
}