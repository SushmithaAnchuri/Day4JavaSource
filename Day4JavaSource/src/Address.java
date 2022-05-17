

public class Address {

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", building=" + building + ", city=" + city + "]";
	}

	String doorno;
	String building;
	String city;
	
public Address(String doorno,String building,String city) {
	this.doorno=doorno;
	this.building=building;
	this.city=city;
}

public Address() {
	// TODO Auto-generated constructor stub
}


public String getDoorno() {
	return doorno;
}

public void setDoorno(String doorno) {
	this.doorno = doorno;
}

public String getBuilding() {
	return building;
}

public void setBuilding(String building) {
	this.building = building;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


}
