package com.list;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedLTest {

	public static void main(String[] args) {

		
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add("r");
		ll.addFirst(400);
		ll.add(2.0);
		ll.add(22.00);
	    ll.add("d");
	    ll.addLast(500);   //addLast() always should be at last
	    
	   
		System.out.println(ll);
		System.out.println("---------------------------------------");
		System.out.println("size = "+ll.size());
		System.out.println("contains = "+ll.contains("h"));
		System.out.println("first = "+ll.getFirst());
		System.out.println("Last = "+ll.getLast());
		
		System.out.println("---------------------------------------");
		
		for(Object o : ll) {
			String s=o.toString();
			System.out.println(s);
			//System.out.println(o);
		}

		System.out.println("-----------------------------------------");
		
		ArrayList a=new ArrayList();
		a.addAll(ll);
		System.out.println(a);
		
	}

}
