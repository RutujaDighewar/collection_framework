package com.list;
import java.util.LinkedHashSet;

public class LinkSetTest {

	public static void main(String[] args) {

     LinkedHashSet lhs=new LinkedHashSet();
     
     lhs.add("a");
     lhs.add(10);
     lhs.add(20);
    
    //  lhs.clear();
     
     System.out.println(lhs);
     System.out.println("-----------------------------------------");
     
     LinkedHashSet lt=new LinkedHashSet();
     lt.add(lhs.clone());
     lt.add("Rutu");
     System.out.println(lt);
     System.out.println("----------------------------------------");
     System.out.println(lhs);
     System.out.println("----------------------------------------");
     
	}

}
