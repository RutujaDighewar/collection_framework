/**
 * 
 */
package collection.Arraylist;

import java.util.ArrayList;

/**
 * @author Rutuja
 *
 */
public class CollectionLimitation {

	public static void main(String[] args) {

		ArrayList pune = new ArrayList();
		pune.add("karvenagar");

		ArrayList mh = new ArrayList();
		mh.add(pune);

		ArrayList India = new ArrayList();
		India.add(mh);

		for (Object o : India) {
			ArrayList a = (ArrayList) o;
			for (Object oo : mh) {
				ArrayList aa = (ArrayList) oo;
				for (Object ooo : pune) {
					String locations = (String) ooo;

					System.out.println(locations);
				}
			}
		}

	}

}
