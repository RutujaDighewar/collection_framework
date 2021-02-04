/**
 * 
 */
package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.IdentityHashMap;

/**
 * @author Rutuja
 *
 */
public class IdentityHashmapTest {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(1, "abc");
		hm.put("a", 123);

		System.out.println(hm);

		Set s = hm.keySet(); // only return key
		for (Object key : s) {
			System.out.println(key);
			Object ob = hm.get(key);
			System.out.println(ob);
		}
		
		System.out.println("--------------------------");
		Set ss=hm.entrySet();    // return key value
		for(Object value : ss) {
		//	System.out.println(value);
		//	System.out.println("----------------------");
			Map.Entry me=(Map.Entry) value;
			System.out.println(me.getKey()+" "+me.getValue());
		}
		System.out.println();
		System.out.println(".....equality check in hashmap.....");
		//System.out.println();
	    HashMap hm1=new HashMap();
	    hm1.put("abc", 1);
	    hm1.put(new String ("abc"), 5);
	    System.out.println(hm1);
	    System.out.println();
	    
	    System.out.println("......equality chech in identity hashmap.....");
	    IdentityHashMap ih= new IdentityHashMap();
	    ih.put("abc", 3);
	    ih.put(new String ("abc"),4);
	    System.out.println(ih);
		
		
		
		
		
		
		
		
		
	}
}
