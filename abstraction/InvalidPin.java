package abstraction;

public class InvalidPin extends RuntimeException{
	private static String message = "Invalid PIN";
	public InvalidPin(){
		super(message);
	}
}
