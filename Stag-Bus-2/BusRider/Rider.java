package BusRider;

public interface Rider {

	//Your members are at least:  age, name, class ( freshman.. ).  Additional would be good.
	//Compare 'some' of your members defining equality across instances
	//To explicitly demonstrate collision leave at least 1 member uncompared 
	boolean equals(Object object);
	
	
	//provide a simple hash code
	public int hashCode();
	
	
	//accessors & mutators
	public String getName(); 
	
	public String getYear();
	
	public int getAge();
	
}
