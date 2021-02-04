package collection.map;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {
	
	public static void main(String args[]) {
		
		Country c=new Country();
		c.setCountry("India");
		
		/*HashMap hm=new HashMap();
		hm.put(c,"Maharashtra");
		
		c=null;
		System.gc();
		
		System.out.println(hm);
		*/
		
		WeakHashMap w=new WeakHashMap();
		w.put(c,"Maharashtra");
		
		c=null;
		System.gc();
		System.out.println(w);
		
	}

}
