package abstraction;

public class InvalidAge extends RuntimeException{
	private static String message="Age is invalid";
	public InvalidAge() {
		super(message);
	}
	public InvalidAge(String msg) {
		super(message);
	}
}
