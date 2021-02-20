package day13;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args){
HashMap<String,String> h=new HashMap();
h.put("Sachin", "sahin op");
h.put("Dhoni", "last");
h.put("Pant", "Middel");
h.put("Hardick", "vaction");
System.out.println(h);
System.out.println(h.get("sachin"));
	System.out.println(h.containsKey("pant"));
	System.out.println("getting keys"+h.keySet());
	
	}
}