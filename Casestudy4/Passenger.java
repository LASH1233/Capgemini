package Casestudy4;

public class Passenger {
	private String name;
	public Passenger(String name) {
		this.name=name;
	}
	@Override 
	public String toString() {
		return "Passenger:"+name;
	}

}
