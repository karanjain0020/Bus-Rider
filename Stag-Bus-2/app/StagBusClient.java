package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import BusFare.BusFareHandler;
import BusFare.BusFareHandlerImpl;
import BusRider.Rider;
import BusRider.RiderImpl;

public class StagBusClient {

	public static void main(String[] args) {
	 

		System.out.println("-----B U I L D  B U S  R I D E R S  T E S T------");
	 
		runRiderTest();
		
		
		System.out.println("-----P A Y  B U S  F A R E  T E S T------");
		BusFareHandler busFare = new BusFareHandlerImpl();
		
		runBusFareHandler(busFare);
		
	}
	
	
	
	public static void runRiderTest() {
		Rider rider1 = new RiderImpl("karan", 21, "sophomore");
		Rider rider2 = new RiderImpl("Sarukh khan", 27, " grad student");
		Rider rider3 = new RiderImpl("salaman khan", 20, " freshman");

		Map<String, Rider> riders = new HashMap<>();

		riders.put("recplex", rider1);
		riders.put("dsb", rider2);
		riders.put("prep", rider3);

		Iterator<String> riderIter = riders.keySet().iterator();
		while (riderIter.hasNext()) {
			String busStop = (String) riderIter.next();
			Rider rider = riders.get(busStop);

			System.out.println(rider.getName());
			System.out.println("the hashcode: " + rider.hashCode());

		}

		System.out.println(riders.get("prep").getYear());
		System.out.println(riders.get("dsb").getYear());
	}
	
	
	public static void runBusFareHandler(BusFareHandler fare) {
		fare.grabChange();
		
		fare.display();
		
		
		int initialCoin = fare.getMaxFromHeap();
	
		
		System.out.println(" Exact Fare paid: " + fare.payBusFare(initialCoin) + " cents ");	
		
		fare.display();
	}
 }
