package com.set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(2);
		ts.add(80);
	//	ts.add("h");
		ts.add(64);
		ts.add(0);
	//	ts.add(null);

		System.out.println(ts);
		System.out.println("----------------");
		System.out.println(ts.first());
		System.out.println("----------------");
		System.out.println(ts.last());
		System.out.println("----------------");
		System.out.println(ts.pollFirst());
		System.out.println("----------------");
		System.out.println("after pollFirst()  -  "+ts);
		System.out.println("----------------");
		System.out.println(ts.pollLast());
		System.out.println("----------------");
		System.out.println("after pollLast()  -  "+ts);
		System.out.println(ts.subSet(2,80));
		System.out.println(ts.higher(64));
		System.out.println(ts.lower(80));
	}

}
