package BusRider;
 

public class RiderImpl implements Rider {
	private String name;
	private int age;
	private String year;

 public RiderImpl(String name, int age, String year) {
	 this.name = name;
	 this.year = year;
	 this.age = age;
 }

@Override
public String getName() {
	return name;
}

@Override
public String getYear() {
	return year;
}

public int getAge() {
	return age;
}


public int hashCode() {
	int value; 
	value=age+name.hashCode();
	return value;
}


public boolean equals(Object object) {
	RiderImpl rider=(RiderImpl) object; 
	if(rider.age==age && rider.name.equals(name)) {
		return true;
	}
	return false;
}


}
