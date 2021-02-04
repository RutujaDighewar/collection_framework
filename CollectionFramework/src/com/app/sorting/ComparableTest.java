/**
 * 
 */
package com.app.sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rutuja
 *
 */
public class ComparableTest {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.setId(100);
		e1.setName("D");
		e1.setAge(34);
		
		Employee e2= new Employee();
		e2.setId(4);
		e2.setName("T");
		e2.setAge(24);
		
		Employee e3= new Employee();
		e3.setId(40);
		e3.setName("A");
		e3.setAge(6);
		
		Employee e4= new Employee();
		e4.setId(12);
		e4.setName("X");
		e4.setAge(80);
		
		List l=new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		l.forEach(System.out::println);
		System.out.println();
		Collections.sort(l);
		System.out.println("  ....... After sorting.......");
		System.out.println();
		l.forEach(System.out::println);
		
	}

}

