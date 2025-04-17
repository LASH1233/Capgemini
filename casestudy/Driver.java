package casestudy;

public class Driver {
	public static void main(String[] args) {
		AbstractVehicle car = new Car("Audi", 300);
		AbstractVehicle bike = new Car("honda", 300);
		car.displayDetails();
		car.start();
		car.displayType();
		car.accelerate(30);
		car.getCurrentSpeed();
		car.brake(30);
		car.getCurrentSpeed();
		car.stop();
		
		bike.displayDetails();
		bike.start();
		bike.displayType();
		bike.accelerate(30);
		bike.getCurrentSpeed();
		bike.brake(30);
		bike.getCurrentSpeed();
		bike.stop();
		
	}
}
