package inheritance;

public class Bike extends Vehicle{
	Bike(String vnumber, String brand, String model, double rentPricePerDay, boolean isAvailable) {
		super(vnumber, brand, model, rentPricePerDay, isAvailable);
	}
	private boolean hasGear;
	public void displayBikeDetails() {
		displayVehicleDetails();
		System.out.println(this.hasGear);
	}
	public boolean getHasGear() {
		return this.hasGear;
	}
	public void setHasGear(boolean v) {
		this.hasGear=v;
	}
}
