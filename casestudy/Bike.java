package casestudy;

public class Bike extends AbstractVehicle{

	public Bike(String name, int speed) {
		super(name, speed);
	}
	@Override
	public void start() {
		System.out.println("car started");
	}
	@Override
	public void stop() {
		System.out.println("car stopped");
	}

}
