package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(101);
		e.setName("Rutu");
		
		ArrayList a= new ArrayList();
		//Vector a=new Vector();
		a.add(1);
		a.add(1.0);
		a.add("b");
		a.add("r");
		a.add("d");
		a.add("h");
		a.add("k");
		a.add("h");
		a.add("h");
		a.add("h");
		a.add("g");
		a.add("y");
		a.add(e);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("d"));
		//System.out.println(a.capacity()); //for vector
		
		/*Object[] ob=a.toArray();
		System.out.println(ob);
		*/
		//using iterator
		Iterator itr=a.iterator();     //one by one iteration
		while(itr.hasNext()) {      //point out element
			Object o=itr.next();     //retrive element
			System.out.println(o);
			if(o instanceof Employee) {
				Employee emp=(Employee) o;
				if(emp.getId()==101) {
					System.out.println(emp.getId()+" "+emp.getName());
				}
			}
			
		}
		System.out.println("-----------------------------------");
		//using enhance for loop
		for(Object obj : a) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------------------------");
		//using forEach
		a.forEach(System.out::println);
		
		
		
		
	}

}
