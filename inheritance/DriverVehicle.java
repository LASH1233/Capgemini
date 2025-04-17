package inheritance;

public class DriverVehicle {
	public static void main(String[] args) {
		Bike b = new Bike("8056789", "bmw", "m3", 67000, true);
		Car c = new Car("343434", "re", "classic", 45000, true);
		b.setHasGear(true);
		c.setDoors(4);
		b.displayBikeDetails();
		c.displayCarDetails();
		b.displayVehicleDetails();

	}
}	
