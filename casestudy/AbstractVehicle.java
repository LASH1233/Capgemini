package casestudy;

abstract public class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed;
	
	public AbstractVehicle(String name,int speed) {
		this.name=name;
		this.speed=speed;
	}
	void displayDetails() {
		System.out.println("Vehicle name : "+name + "\nVehicleSpeed: " + speed);
	}
	@Override
	public void accelerate(int increment) {
		this.speed+=increment;
	}
	@Override
	public void brake(int decrement) {
		this.speed-=decrement;
	}
	@Override
	public void getCurrentSpeed() {
		System.out.println(speed);
	}
}
