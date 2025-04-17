package abstraction;

public class InvalidMoney extends RuntimeException{
	private static String message="Invalid money";
	public InvalidMoney(){
		super(message);
	}
}
