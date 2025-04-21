package Casestudy4;

import java.util.ArrayList;
import java.util.List;

public class Flight<T> {
	private String flightNumber;
	private List<T> passengers;
	public Flight(String flightNumber) {
		this.flightNumber=flightNumber;
		this.passengers=new ArrayList<>();
	}
	public void addPassengers(T passenger) {
		passengers.add(passenger);
	}
	public void showPasseneger() {
		System.out.println("Flight:"+ flightNumber+"\t" + "Passenger");
		for(T passenger: passengers) {
			System.out.println(passenger);
		}
		System.out.println();
	}
	

}
