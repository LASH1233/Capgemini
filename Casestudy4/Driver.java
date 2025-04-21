package Casestudy4;

public class Driver {
	public static void main(String[] args) {
		Flight<Passenger> economyflight=new Flight<>("A123");
		Passenger john=new Passenger("john");
		economyflight.addPassengers(john);
		Flight<Vippassenger> vipflight=new Flight<>("B456");
		Vippassenger Alice = new Vippassenger("Alice");
		vipflight.addPassengers(Alice);
		
		economyflight.showPasseneger();
		vipflight.showPasseneger();
		
	}

}
