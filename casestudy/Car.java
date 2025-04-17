package casestudy;

public class Car extends AbstractVehicle{
	public Car(String name,int speed) {
		super(name,speed);
	}
	@Override
	public void start() {
		System.out.println("car started");
	}
	public void stop() {
		System.out.println("car stopped");
	}
}
