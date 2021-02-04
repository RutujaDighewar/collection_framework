package com.app.sortiong.comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
	
	Student e1=new Student();
	e1.setId(100);
	e1.setName("D");
	e1.setAge(34);
	
	Student e2= new Student();
	e2.setId(4);
	e2.setName("T");
	e2.setAge(24);
	
	Student e3= new Student();
	e3.setId(40);
	e3.setName("A");
	e3.setAge(6);
	
	Student e4= new Student();
	e4.setId(12);
	e4.setName("X");
	e4.setAge(80);
	
	List list=new ArrayList();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	list.forEach(System.out::println);
	System.out.println();
	
	System.out.println("AFTER AGE WISE SORTING");
	Collections.sort(list, new AgeWiseSorting());
	list.forEach(System.out::println);
	
	System.out.println();
	System.out.println("AFTER NAME WISE SORTING");
	Collections.sort(list, new NameWiseSorting());
	list.forEach(System.out::println);
	
	System.out.println();
	System.out.println("AFTER ID WISE SORTING");
	Collections.sort(list, new IdWiseSorting());
	list.forEach(System.out::println);
	
}
}