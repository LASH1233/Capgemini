package casestudy;

public interface Vehicle {
	void start();
	void stop();
	void accelerate(int increment) ;
	void brake(int decrement);
	void getCurrentSpeed();
	default void displayType() {
		System.out.println(this.getClass().getSimpleName());
	}
	
}
