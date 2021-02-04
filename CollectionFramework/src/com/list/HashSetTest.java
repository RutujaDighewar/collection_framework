/**
 * 
 */
package com.list;

import java.util.HashSet;

/**
 * @author Rutuja
 *
 */
public class HashSetTest {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add("abc");
		hs.add(800);    //insertion order not maintain
		hs.add(4.8);
		hs.add(2);
		hs.add(3);
		hs.add("e");
		hs.add("g");
		hs.add("j");
		
		// hs.add(null);
		hs.add(800); // equals-current replace with old

		System.out.println(hs);
		System.out.println("-------------------------------");
		System.out.println("size = " + hs.size());
		System.out.println("contains = " + hs.contains(400));
		System.out.println("--------------------------------");

		for (Object o : hs) {
			String s = o.toString();
			System.out.println(s);
		}

		System.out.println("--------------------------------");

		HashSet equality = new HashSet();
		equality.add("abc");
		equality.add(new String("abc"));
		System.out.println(equality);
		System.out.println("--------------------------------");

	}

}
