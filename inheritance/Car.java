package inheritance;

public class Car extends Vehicle{
	Car(String vnumber, String brand, String model, double rentPricePerDay, boolean isAvailable) {
		super(vnumber, brand, model, rentPricePerDay, isAvailable);
	}
	private int doors;
	public void displayCarDetails() {
		displayVehicleDetails();
		System.out.println(this.doors);
	}
	public int getDoors() {
		return this.doors;
	}
	public void setDoors(int doors) {
		this.doors=doors;
	}
}
