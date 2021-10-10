package BusRider;  
import java.util.*; 

public class RiderTester {

	public static void main(String[] args) {
  
		Rider rider1=new RiderImpl("karan", 21, "sophomore");
		Rider rider2=new RiderImpl("Sarukh khan", 27, " grad student");
		Rider rider3=new RiderImpl("salaman khan", 20, " freshman");
		
		
		Map<String, Rider> riders=new HashMap<>();
		
		riders.put("recplex", rider1);
		riders.put("dsb", rider2);
		riders.put("prep", rider3);
		
		
		Iterator<String> riderIter=riders.keySet().iterator();
		while(riderIter.hasNext()) {
			String busStop=(String) riderIter.next();
			Rider rider=riders.get(busStop);
			
			System.out.println(rider.getName());
			System.out.println("the hashcode: "+ rider.hashCode());
		
		}
		
		System.out.println(riders.get("prep").getYear());
		System.out.println(riders.get("dsb").getYear());
		
	}

}
