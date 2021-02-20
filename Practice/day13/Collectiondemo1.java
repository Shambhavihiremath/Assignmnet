package day13;

import java.util.ArrayList;
import java.util.Collections;

public class Collectiondemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
		list.add(1);//Adding object in arraylist  
		list.add(2);  
		list.add(3);
		list.add(7);
		System.out.println("elements"+list);
		Collections.sort(list);
		System.out.println("after sorting"+list);
		//Collections.reverse(list);
		//System.out.println("after reverse" +list);  
		System.out.println("Minimum value" +Collections.min(list));
		System.out.println("Maxmium value"+Collections.max(list));
		int index=Collections.binarySearch(list, 7);
		System.out.println("elemnts found at: "+index);
	//we cant do reverse and then binaryseach for binary seacg elements should be in sorted order
	}

}
