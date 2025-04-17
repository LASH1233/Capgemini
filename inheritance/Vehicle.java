package inheritance;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public void displayVehicleDetails() {
		System.out.println(this.vehicleNumber);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.rentalPricePerDay);
		System.out.println(this.isAvailable);
	}
	public void rentDisplay() {
		if(this.isAvailable) {
			System.out.println("Car is avilable");
			System.out.println("Price for rent: " + this.rentalPricePerDay);
		}
		
	}
	Vehicle(String vnumber,String brand,String model,double rentPricePerDay,boolean isAvailable){
		this.vehicleNumber=vnumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentPricePerDay;
		this.isAvailable = isAvailable;
	}
}
