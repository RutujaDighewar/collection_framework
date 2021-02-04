/**
 * 
 */
package collection.HasASolution;

/**
 * @author Rutuja
 *
 */
public class HasASolution {

	public static void main(String[] args) {
         
		Country c=new Country();
		c.setCountryName("India");
		
		State s=new State();
		s.setStateName("Maharashtra");
		
		City ct=new City();
		ct.setCityName("Pune");
		
		Location l=new Location();
		l.setLocationName("karve nagar");
		l.setCity(ct);
		l.setState(s);
		l.setCountry(c);
		
		System.out.println(l.getCountry().getCountryName());
		System.out.println("\t"+l.getState().getStateName());
		System.out.println("\t\t\t"+l.getCity().getCityName());
		System.out.println("\t\t\t\t"+l.getLocationName());
		
	}

}
