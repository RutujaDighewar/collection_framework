package com.app.sortiong.comparator;
import java.util.Comparator;

public class IdWiseSorting implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		
		if(s1.getId() == s2.getId())
			return 0;
		else if(s1.getId() < s2.getId())
			return 1;
		else
			return -1;
		
	}

}
